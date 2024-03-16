package interview.mt240316.mt1;

import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (scanner.hasNextInt()) { // 注意 while 处理多个 case
            int size = scanner.nextInt();
            long sum = 0;
            for (int i = 0; i < size; i++) {
                sum += scanner.nextInt();
            }
            int one = scanner.nextInt();
            int two = scanner.nextInt();

            sum -= one;
            sum -= two;

            System.out.println(sum);


        }
    }
}