package NKW_HW.two.HJ83;

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

    public static boolean can(int row, int col, int x, int y) {
        return 0 <= x && x < row && 0 <= y && y < col;
    }

    public static boolean can(int row, int x) {
        return 0 <= x && x < row && x <= 8 && row < 9;
    }

    public static void print(boolean can) {
        if (can) {
            System.out.println(0);
        } else {
            System.out.println(-1);
        }
    }

    public static void solution(Scanner scanner) {
        int row = scanner.nextInt();
        int col = scanner.nextInt();
        if (row <= 9 && col <= 9) {
            System.out.println(0);
        } else {
            System.out.println(-1);
            row = Math.min(row, 9);
            col = Math.min(col, 9);
        }

        boolean tt = can(row, col, scanner.nextInt(), scanner.nextInt());
        boolean ttt = can(row, col, scanner.nextInt(), scanner.nextInt());
        print(tt && ttt);
        print(can(row, scanner.nextInt()));
        print(can(col, scanner.nextInt()));
        print(can(row, col, scanner.nextInt(), scanner.nextInt()));
    }


}












