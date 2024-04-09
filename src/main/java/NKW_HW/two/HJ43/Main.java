package NKW_HW.two.HJ43;

import java.util.*;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (scanner.hasNext()) { // 注意 while 处理多个 case
            solution(scanner);
        }
    }

    private static class Node {
        int x;
        int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    private static int row;
    private static int col;
    private static int[][] list;
    private static boolean[][] visit;
    private static boolean find;
    private static List<Node> res;

    private static boolean in(int x, int y) {
        return x >= 0 && x < row && y >= 0 && y < col;
    }

    private static void dfs(List<Node> temp, int x, int y) {
        if (!in(x, y) || visit[x][y] || list[x][y] == 1 || find) {
            return;
        }
        if (x == row - 1 && y == col - 1) {
            res = new ArrayList<>(temp);
            res.add(new Node(x, y));
            find = true;
            return;
        }
        visit[x][y] = true;
        temp.add(new Node(x, y));

        dfs(temp, x + 1, y);
        dfs(temp, x - 1, y);
        dfs(temp, x, y + 1);
        dfs(temp, x, y - 1);

        temp.remove(temp.size() - 1);
    }

    public static void solution(Scanner scanner) {
        find = false;
        res = new ArrayList<>();
        row = scanner.nextInt();
        col = scanner.nextInt();
        list = new int[row][col];
        visit = new boolean[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                list[i][j] = scanner.nextInt();
            }
        }
        dfs(new ArrayList<>(), 0, 0);

        for (Node node : res) {
            System.out.println("(" + node.x + "," + node.y + ")");
        }
    }
}












