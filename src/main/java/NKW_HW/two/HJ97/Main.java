package NKW_HW.two.HJ97;

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
        int fushu = 0;
        int zero = 0;
        int sum = 0;
        for (int i = 0; i < size; i++) {
            int temp = scanner.nextInt();
            if (temp < 0) {
                fushu++;
            } else if (temp > 0) {
                sum += temp;
            } else {
                zero++;
            }
        }
        if (size - zero - fushu == 0) {
            System.out.println(fushu + " " + "0.0");
        } else {
            System.out.printf("%d %.1f", fushu, (sum * 1.0 / (size - zero - fushu)));
        }
    }
}












