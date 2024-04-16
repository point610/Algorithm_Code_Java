package LeetCode.Middle.LeetCode542;

import java.util.LinkedList;
import java.util.Queue;

class Solution {
    private static int[][] dir = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    private static int row, col;

    public int[][] updateMatrix(int[][] mat) {
        row = mat.length;
        col = mat[0].length;
        boolean[][] visit = new boolean[row][col];
        Queue<Node> queue = new LinkedList<>();
        int[][] list = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (mat[i][j] == 0) {
                    visit[i][j] = true;
                    queue.add(new Node(i, j));
                }
            }
        }

        // 从0开始广度优先搜索，对1的进行赋值
        while (!queue.isEmpty()) {
            Node node = queue.poll();
            for (int i = 0; i < 4; i++) {
                int x = node.x + dir[i][0];
                int y = node.y + dir[i][1];
                if (in(x, y) && !visit[x][y]) {
                    visit[x][y] = true;
                    list[x][y] = list[node.x][node.y] + 1;
                    queue.add(new Node(x, y));
                }
            }
        }
        return list;
    }

    private static class Node {
        int x, y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    private static boolean in(int x, int y) {
        return x >= 0 && x < row && y >= 0 && y < col;
    }
}

public class LeetCode542 {
}
