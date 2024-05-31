package LeetCode.Middle.LeetCode934;

import java.awt.*;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

class Solution {

    private class Node {
        int x;
        int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    private Queue<Node> queue = new LinkedList<>();

    private int size;
    private boolean[][] visit;

    private void dfs(int[][] grid, int x, int y) {
        if (!in(x, y) || visit[x][y] || grid[x][y] == 0) {
            return;
        }

        grid[x][y] = 2;

        visit[x][y] = true;
        queue.add(new Node(x, y));
        dfs(grid, x + 1, y);
        dfs(grid, x - 1, y);
        dfs(grid, x, y + 1);
        dfs(grid, x, y - 1);

    }

    private boolean in(int x, int y) {
        return x >= 0 && x < size && y >= 0 && y < size;
    }

    public int shortestBridge(int[][] grid) {
        size = grid.length;
        visit = new boolean[size][size];

        boolean find = false;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (grid[i][j] == 1) {
                    dfs(grid, i, j);

                    find = true;
                    break;
                }
            }
            if (find) {
                break;
            }
        }

        int res = -1;

        while (!queue.isEmpty()) {
            Queue<Node> qqq = new LinkedList<>();
            while (!queue.isEmpty()) {
                Node node = queue.poll();

                if (grid[node.x][node.y] == 1) {
                    return res;
                }

                if (in(node.x + 1, node.y) && !visit[node.x + 1][node.y]) {
                    visit[node.x + 1][node.y] = true;
                    qqq.add(new Node(node.x + 1, node.y));
                }


                if (in(node.x - 1, node.y) && !visit[node.x - 1][node.y]) {
                    visit[node.x - 1][node.y] = true;
                    qqq.add(new Node(node.x - 1, node.y));
                }


                if (in(node.x, node.y + 1) && !visit[node.x][node.y + 1]) {
                    visit[node.x][node.y + 1] = true;
                    qqq.add(new Node(node.x, node.y + 1));
                }

                if (in(node.x, node.y - 1) && !visit[node.x][node.y - 1]) {
                    visit[node.x][node.y - 1] = true;
                    qqq.add(new Node(node.x, node.y - 1));
                }

            }
            res++;
            queue = qqq;
        }

        return res;
    }
}

public class LeetCode934 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.shortestBridge(new int[][]{{0, 1, 0, 0, 0}, {0, 1, 0, 1, 1}, {0, 0, 0, 0, 1}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}}));
        System.out.println(solution.shortestBridge(new int[][]{{0, 1}, {1, 0}}));
        System.out.println(solution.shortestBridge(new int[][]{{0, 1, 0}, {0, 0, 0}, {0, 0, 1}}));
        System.out.println(solution.shortestBridge(new int[][]{{1, 1, 1, 1, 1}, {1, 0, 0, 0, 1}, {1, 0, 1, 0, 1}, {1, 0, 0, 0, 1}, {1, 1, 1, 1, 1}}));
    }
}






