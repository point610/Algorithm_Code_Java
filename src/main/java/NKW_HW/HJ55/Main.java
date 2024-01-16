package NKW_HW.HJ55;

import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (scanner.hasNextInt()) { // 注意 while 处理多个 case
            int size = scanner.nextInt();
            int count = 0;
            for (int i = 1; i <= size; i++) {
                if (i % 7 == 0 || has7(i)) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }

    private static boolean has7(int one) {
        String s = String.valueOf(one);
        return s.indexOf('7') != -1;

    }
}