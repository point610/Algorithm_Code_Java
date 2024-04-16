package NKW_HW.two.HJ44;

import java.util.ArrayList;
import java.util.List;
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

    private static int[][] list;
    private static List<Node> nodes;

    private static class Node {
        int x;
        int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void solution(Scanner scanner) {
        list = new int[9][9];
        nodes = new ArrayList<>();
        find = false;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                int temp = scanner.nextInt();
                if (temp == 0) {
                    nodes.add(new Node(i, j));
                }
                list[i][j] = temp;
            }
        }
        dfs(0);
    }

    private static boolean find;

    private static void dfs(int index) {
        if (find) {
            return;
        }
        if (index == nodes.size()) {
            find = true;
            print();
            return;
        }

        int x = nodes.get(index).x;
        int y = nodes.get(index).y;

        for (int i = 1; i <= 9; i++) {
            if (check(x, y, i)) {
                list[x][y] = i;
                dfs(index + 1);
                list[x][y] = 0;
            }
        }
    }

    private static void print() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(list[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static boolean check(int x, int y, int target) {

        for (int j = 0; j < 9; j++) {
            if (list[x][j] == target) {
                return false;
            }
        }

        for (int j = 0; j < 9; j++) {
            if (list[j][y] == target) {
                return false;
            }
        }

        int startx = (x / 3) * 3;
        int starty = (y / 3) * 3;
        for (int i = startx; i < startx + 3; i++) {
            for (int j = starty; j < starty + 3; j++) {
                if (list[i][j] == target) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean check() {
        for (int i = 0; i < 9; i++) {
            int[] temp = new int[9];
            for (int j = 0; j < 9; j++) {
                temp[list[i][j] - 1]++;
            }
            for (int j = 0; j < 9; j++) {
                if (temp[j] > 1) {
                    return false;
                }
            }
        }

        for (int i = 0; i < 9; i++) {
            int[] temp = new int[9];
            for (int j = 0; j < 9; j++) {
                temp[list[j][i] - 1]++;
            }
            for (int j = 0; j < 9; j++) {
                if (temp[j] > 1) {
                    return false;
                }
            }
        }

        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {
                int[] temp = new int[9];
                for (int x = i; x < i + 3; x++) {
                    for (int y = j; y < j + 3; y++) {
                        temp[list[x][y] - 1]++;
                    }
                }

                for (int k = 0; k < 9; k++) {
                    if (temp[k] > 1) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}












