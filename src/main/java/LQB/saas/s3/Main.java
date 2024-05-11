package LQB.saas.s3;

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

    private static int[][] list;
    private static Integer SUM = 15;

    private static boolean check() {
        for (int i = 0; i < 3; i++) {
            int sum = 0;
            for (int j = 0; j < 3; j++) {
                sum += list[i][j];
            }
            if (sum != SUM) {
                return false;
            }
        }
        for (int i = 0; i < 3; i++) {
            int sum = 0;
            for (int j = 0; j < 3; j++) {
                sum += list[j][i];
            }
            if (sum != SUM) {
                return false;
            }
        }
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += list[i][i];
        }
        if (sum != SUM) {
            return false;
        }
        sum = 0;
        for (int i = 0, j = 2; i < 3; j--, i++) {
            sum += list[i][j];
        }
        if (sum != SUM) {
            return false;
        }
        return true;
    }

    private static boolean[] visit;
    private static boolean find;
    private static int number;
    private static int[][] templist;

    private static void dfs(List<Node> nodes, int zeroindex) {
        if (find) {
            return;
        }
        if (zeroindex >= nodes.size()) {
            if (check()) {
                number++;
                templist = new int[3][3];
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        templist[i][j] = list[i][j];
                    }
                }
                if (number >= 2) {
                    find = true;
                }
            }
            return;
        }

        for (int i = 1; i <= 9; i++) {
            if (visit[i]) {
                continue;
            }
            visit[i] = true;
            list[nodes.get(zeroindex).x][nodes.get(zeroindex).y] = i;
            dfs(nodes, zeroindex + 1);
            visit[i] = false;
            list[nodes.get(zeroindex).x][nodes.get(zeroindex).y] = 0;
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

    public static void solution(Scanner scanner) {
        list = new int[3][3];
        find = false;
        number = 0;
        visit = new boolean[10];
        List<Node> nodes = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list[i][j] = scanner.nextInt();
                if (list[i][j] == 0) {
                    nodes.add(new Node(i, j));
                }
                visit[list[i][j]] = true;
            }
        }
        dfs(nodes, 0);
        if (number == 1) {
            printlist();
        } else {
            System.out.println("Too Many");
        }
    }

    private static void printlist() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(templist[i][j] + " ");
            }
            System.out.println();
        }

    }
}












