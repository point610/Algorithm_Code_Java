package NKW_HW.one.HJ82;

// 有一说一，他们说这是数学家提出的算法，但是我自己也想出来了这个算法，巨开心哈哈哈

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str = br.readLine()) != null) {
            String[] ss = str.split("/");
            long a = Integer.parseInt(ss[0]);
            long b = Integer.parseInt(ss[1]);
            long t;
            StringBuilder sb = new StringBuilder();
            while (a != 0) {
                t = b / a + (b % a == 0 ? 0 : 1);
                if (b % t == 0 && a >= t) {
                    a -= b / t;
                    sb.append('1').append('/').append(t).append('+');
                } else {
                    a = a * t - b;
                    b = b * t;    // 这里可能溢出，所以都用long
                    if (a != 0) sb.append('1').append('/').append(t).append('+');
                    else sb.append('1').append('/').append(t);
                }
                if (a == 1) {
                    sb.append('1').append('/').append(b);
                    break;
                }
            }
            System.out.println(sb);

        }
    }
}
