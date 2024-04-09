package NKW_HW.two.HJ38;

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
        double one = temp;
        double two = temp;
        for (int i = 0; i < 5; i++) {
            if (i != 4) {
                one += two;
            }
            two /= 2;
        }

        System.out.println(one);
        System.out.println(two);

    }
}












