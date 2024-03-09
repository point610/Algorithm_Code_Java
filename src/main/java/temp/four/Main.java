package temp.four;

import java.math.BigInteger;
import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (scanner.hasNextInt()) { // 注意 while 处理多个 case
            int size = scanner.nextInt();
            int zeronumber = scanner.nextInt();
            BigInteger sum = new BigInteger(String.valueOf(1));
            BigInteger[] list = new BigInteger[size];
            for (int i = 0; i < size; i++) {
                list[i] = new BigInteger(String.valueOf(scanner.nextInt()));
                sum = sum.multiply(list[i]);
            }

            long count = 0;

            for (int left = 0; left < size; left++) {
                BigInteger temp = new BigInteger(String.valueOf(1));
                int right = left;
                while (right < size) {
                    temp = temp.multiply(list[right]);
                    if (countzero(sum.divide(temp)) >= zeronumber) {
                        count++;
                    }

                    right++;
                }

            }

            System.out.println(count);
        }
    }

    private static int countzero(BigInteger one) {
        String string = one.toString();
        for (int i = string.length() - 1; i >= 0; i--) {
            if (string.charAt(i) != '0') {
                return string.length() - 1 - i;
            }
        }
        return 0;
    }
}