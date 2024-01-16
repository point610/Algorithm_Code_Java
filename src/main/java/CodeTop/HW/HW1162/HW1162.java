package CodeTop.HW.HW1162;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @ClassName HW1162
 * @Description TODO
 * @Author point
 * @Date 2023/12/28 10:22
 * @Version 1.0
 */
class Solution {
    private class Node {
        int x;

        int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    int row;

    int col;

    public int maxDistance(int[][] grid) {

        Queue<Node> queue = new LinkedList<>();
        row = grid.length;
        col = grid[0].length;
        boolean[][] visit = new boolean[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == 1) {
                    queue.add(new Node(i, j));
                    visit[i][j] = true;
                }
            }
        }
        if (queue.isEmpty() || queue.size() == row * col) {
            return -1;
        }
        int count = 0;
        while (!queue.isEmpty()) {

            Queue<Node> temp = new LinkedList<>();
            count++;
            while (!queue.isEmpty()) {
                Node currentnode = queue.poll();
                int x = currentnode.x;
                int y = currentnode.y;
                if (in(x + 1, y) && !visit[x + 1][y]) {
                    visit[x + 1][y] = true;
                    temp.add(new Node(x + 1, y));
                }
                if (in(x - 1, y) && !visit[x - 1][y]) {
                    visit[x - 1][y] = true;
                    temp.add(new Node(x - 1, y));
                }
                if (in(x, y + 1) && !visit[x][y + 1]) {
                    visit[x][y + 1] = true;
                    temp.add(new Node(x, y + 1));
                }
                if (in(x, y - 1) && !visit[x][y - 1]) {
                    visit[x][y - 1] = true;
                    temp.add(new Node(x, y - 1));
                }
            }
            queue = temp;
        }
        return count-1;
    }

    private boolean in(int x, int y) {
        return 0 <= x && x < row && 0 <= y && y < col;
    }
}

public class HW1162 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.maxDistance(new int[][]{{1, 0, 1}, {0, 0, 0}, {1, 0, 1}}));

    }
}
