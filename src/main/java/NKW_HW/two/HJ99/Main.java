package NKW_HW.two.HJ99;

import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (scanner.hasNext()) { // 注意 while 处理多个 case
            solution(scanner);
        }
    }

    public static void solution(Scanner scanner) {
        int size = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i <= size; i++) {
            if (can(i)) {
                sum++;
            }
        }
        System.out.println(sum);
    }

    private static boolean can(int one) {
        int size = String.valueOf(one).length();
        return one * one % Math.pow(10, size) == one;
    }

}












