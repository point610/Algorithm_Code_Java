package NKW_HW.two.HJ107;

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
        double target = scanner.nextDouble();

        double temp = -20.0;
        double step = 0.1;

        while (pow(temp + step) <= target) {
            temp += step;
        }

        if (target - pow(temp) < pow(temp + step) - target) {
            System.out.printf("%.1f", temp);
        } else {
            System.out.printf("%.1f", (temp + step));
        }
    }

    public static double pow(double one) {
        return one * one * one;
    }
}












