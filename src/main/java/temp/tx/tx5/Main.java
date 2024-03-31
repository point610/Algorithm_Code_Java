package temp.tx.tx5;

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

    private static int row;
    private static int col;
    private static int sum;
    private static char[][] list;

    public static boolean in(int x, int y) {
        return x >= 0 && x < row && y >= 0 && y < col;
    }

    public static boolean check(int index, char c, String ss) {
        return c == ss.charAt(index);
    }

    public static void dfs(int x, int y, int index, String ss) {
        if (!in(x, y)) {
            return;
        }
        if (!check(index, list[x][y], ss)) {
            return;
        }
        if (index == 6) {
            sum++;
            return;
        }
        if (index > 6) {
            return;
        }
        dfs(x + 1, y, index + 1, ss);
        dfs(x, y + 1, index + 1, ss);
        dfs(x - 1, y, index + 1, ss);
        dfs(x, y - 1, index + 1, ss);
    }

    public static void solution(Scanner scanner) {
        row = scanner.nextInt();
        col = scanner.nextInt();
        list = new char[row][col];
        scanner.nextLine();
        for (int i = 0; i < row; i++) {
            list[i] = scanner.nextLine().toCharArray();
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (list[i][j] == 't') {
                    dfs(i, j, 0, "tencent");
                }
            }
        }
        System.out.println(sum);

    }
}























