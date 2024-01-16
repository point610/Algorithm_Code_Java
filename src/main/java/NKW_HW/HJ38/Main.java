package NKW_HW.HJ38;

import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (scanner.hasNextInt()) { // 注意 while 处理多个 case
            double one = scanner.nextInt();
            double sum = one;
            for (int i = 0; i < 4; i++) {
                sum += one;
                one /= 2;
            }
            System.out.println(sum);
            System.out.println(one/2);

        }
    }
}