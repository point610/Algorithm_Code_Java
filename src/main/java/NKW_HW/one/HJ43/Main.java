package NKW_HW.one.HJ43;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    static int row;

    static int col;

    static List<String> plist;

    static int[][] list;

    static boolean[][] visit;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (scanner.hasNextInt()) { // 注意 while 处理多个 case
            row = scanner.nextInt();
            col = scanner.nextInt();
            plist = new ArrayList<>();
            list = new int[row][col];
            visit = new boolean[row][col];

            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    list[i][j] = scanner.nextInt();
                }
            }

            getone();
            int size = plist.size();
            for (int i = 0; i < size; i++) {
                System.out.println(plist.get(i));
            }
        }
    }

    private static boolean in(int x, int y) {
        return 0 <= x && x < row && 0 <= y && y < col;
    }

    private static void DFS(int x, int y, List<String> res) {
        if (!in(x, y) || visit[x][y] || list[x][y] == 1) {
            return;
        }
        if (x == row - 1 && y == col - 1) {
            res.add("(" + x + "," + y + ")");
            plist = new ArrayList<>(res);
            return;
        }
        visit[x][y] = true;
        res.add("(" + x + "," + y + ")");
        DFS(x - 1, y, res);
        DFS(x, y - 1, res);
        DFS(x + 1, y, res);
        DFS(x, y + 1, res);
        visit[x][y] = false;

        res.remove(res.size() - 1);
    }

    private static void getone() {
        List<String> res = new ArrayList<>();
        DFS(0, 0, res);
    }
}