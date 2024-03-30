package NKW_HW.two.HJ76;

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
        int temp = scanner.nextInt();
        int one = (int) Math.pow(temp, 3);
        if (temp % 2 == 0) {
            for (int i = one / temp - 1 - (temp - 2); i <= one / temp + 1 + (temp - 2); i += 2) {
                System.out.print(i);
                if (i != one / temp + 1 + (temp - 2)) {
                    System.out.print('+');
                }
            }
        } else {
            for (int i = one / temp - (temp - 1); i <= one / temp + (temp - 1); i += 2) {
                System.out.print(i);
                if (i != one / temp + (temp - 1)) {
                    System.out.print('+');
                }
            }
        }

    }
}












