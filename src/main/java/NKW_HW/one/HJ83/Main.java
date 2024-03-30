package NKW_HW.one.HJ83;

import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (scanner.hasNext()) { // 注意 while 处理多个 case
            int m = scanner.nextInt();
            int n = scanner.nextInt();
            if (m <= 9 && n <= 9) {
                System.out.println(0);
            } else {
                System.out.println(-1);
                m = Math.min(m, 9);
                n = Math.min(n, 9);
            }
            problem(m, n, scanner);
        }
    }

    private static boolean in(int m, int n, int x, int y) {
        return 0 <= x && x < m && 0 <= y && y < n;
    }

    private static void problem(int m, int n, Scanner scanner) {
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        if (in(m, n, x1, y1) && in(m, n, x2, y2)) {
            System.out.println(0);
        } else {
            System.out.println(-1);
        }
        // ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        int x = scanner.nextInt();
        if (0 <= x && x < m && m <= 8) {
            System.out.println(0);
        } else {
            System.out.println(-1);
        }
        // ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        int y = scanner.nextInt();
        if (0 <= y && y < n && n <= 8) {
            System.out.println(0);
        } else {
            System.out.println(-1);
        }
        // ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        x1 = scanner.nextInt();
        y1 = scanner.nextInt();
        if (in(m, n, x1, y1)) {
            System.out.println(0);
        } else {
            System.out.println(-1);
        }
    }
}
