package NKW_HW.two.HJ82;


// 有一说一，他们说这是数学家提出的算法，但是我自己也想出来了这个算法，巨开心哈哈哈

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str = br.readLine()) != null) {

            String[] ss = str.split("/");
            long one = Integer.parseInt(ss[0]);
            long two = Integer.parseInt(ss[1]);
            long temp;
            StringBuilder stringBuilder = new StringBuilder();
            while (one != 0) {
                temp = two / one + (two % one == 0 ? 0 : 1);
                if (two % temp == 0 && one >= temp) {
                    one -= two / temp;
                    stringBuilder.append('1').append('/').append(temp).append('+');
                } else {
                    one = one * temp - two;
                    two = two * temp;    // 这里可能溢出，所以都用long
                    if (one != 0) {
                        stringBuilder.append('1').append('/').append(temp).append('+');
                    } else {
                        stringBuilder.append('1').append('/').append(temp);
                    }
                }
                if (one == 1) {
                    stringBuilder.append('1').append('/').append(two);
                    break;
                }
            }
            System.out.println(stringBuilder);

        }
    }
}
