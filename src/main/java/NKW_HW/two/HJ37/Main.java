package NKW_HW.two.HJ37;

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
        if (size <= 2) {
            System.out.println(1);
            return;
        }
        int one = 1;
        int two = 1;
        for (int i = 2; i < size; i++) {
            int temp = one + two;
            one = two;
            two = temp;
        }
        System.out.println(two);
    }
}












