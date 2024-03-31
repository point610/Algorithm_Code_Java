package temp.wz.three;

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
        for (int i = 0; i < size; i++) {
            int x = scanner.nextInt();
            int s = scanner.nextInt();
            int sub = s - x;

            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            int d = scanner.nextInt();

            int sum = b + d;
            int left = sub % sum;
            if (left <= b && left != 0) {
                System.out.println(1);
            } else {
                System.out.println(2);
            }

        }


    }
}












