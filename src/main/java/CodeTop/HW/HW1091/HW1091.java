package CodeTop.HW.HW1091;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @ClassName HW1091
 * @Description TODO
 * @Author point
 * @Date 2023/12/28 15:56
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

    private int row;

    private int col;

    private boolean[][] visit;

    private int count;

    private int res;

    private boolean in(int x, int y) {
        return 0 <= x && x < row && 0 <= y && y < col;
    }


    public int shortestPathBinaryMatrix(int[][] grid) {
        row = grid.length;
        res = 0;
        count = 0;
        col = grid[0].length;
        visit = new boolean[row][col];
        if (grid[0][0] == 1 || grid[row - 1][col - 1] == 1) {
            return -1;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(0, 0));
        while (!queue.isEmpty()) {
            Queue<Node> temp = new LinkedList<>();
            count++;

            while (!queue.isEmpty()) {
                Node current = queue.poll();
                int x = current.x;
                int y = current.y;

                if (x == row - 1 && y == col - 1) {
                    res = Math.max(res, count);
                    continue;
                }

                visit[x][y] = true;
                // 加入temp
                if (in(x + 1, y) && grid[x + 1][y] == 0 && !visit[x + 1][y]) {
                    visit[x + 1][y] = true;
                    temp.add(new Node(x + 1, y));
                }
                if (in(x - 1, y) && grid[x - 1][y] == 0 && !visit[x - 1][y]) {
                    visit[x - 1][y] = true;
                    temp.add(new Node(x - 1, y));
                }
                if (in(x, y + 1) && grid[x][y + 1] == 0 && !visit[x][y + 1]) {
                    visit[x][y + 1] = true;
                    temp.add(new Node(x, y + 1));
                }
                if (in(x, y - 1) && grid[x][y - 1] == 0 && !visit[x][y - 1]) {
                    visit[x][y - 1] = true;
                    temp.add(new Node(x, y - 1));
                }
                if (in(x + 1, y + 1) && grid[x + 1][y + 1] == 0 && !visit[x + 1][y + 1]) {
                    visit[x + 1][y + 1] = true;
                    temp.add(new Node(x + 1, y + 1));
                }
                if (in(x + 1, y - 1) && grid[x + 1][y - 1] == 0 && !visit[x + 1][y - 1]) {
                    visit[x + 1][y - 1] = true;
                    temp.add(new Node(x + 1, y - 1));
                }
                if (in(x - 1, y + 1) && grid[x - 1][y + 1] == 0 && !visit[x - 1][y + 1]) {
                    visit[x - 1][y + 1] = true;
                    temp.add(new Node(x - 1, y + 1));
                }
                if (in(x - 1, y - 1) && grid[x - 1][y - 1] == 0 && !visit[x - 1][y - 1]) {
                    visit[x - 1][y - 1] = true;
                    temp.add(new Node(x - 1, y - 1));
                }
            }
            queue = temp;
        }


        return res == 0 ? -1 : res;
    }
}

public class HW1091 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.shortestPathBinaryMatrix(new int[][]{{0, 0, 0, 0, 1}, {1, 0, 0, 0, 0}, {0, 1, 0, 1, 0}, {0, 0, 0, 1, 1}, {0, 0, 0, 1, 0}}));
        System.out.println(solution.shortestPathBinaryMatrix(new int[][]{{0, 1}, {1, 0}}));
        System.out.println(solution.shortestPathBinaryMatrix(new int[][]{{0, 0, 0}, {1, 1, 0}, {1, 1, 0}}));
        System.out.println(solution.shortestPathBinaryMatrix(new int[][]{{1, 0, 0}, {1, 1, 0}, {1, 1, 0}}));
    }
}
