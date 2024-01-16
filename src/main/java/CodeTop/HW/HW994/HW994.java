package CodeTop.HW.HW994;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @ClassName HW994
 * @Description TODO
 * @Author point
 * @Date 2023/12/26 11:28
 * @Version 1.0
 */
class Solution {
    private boolean[][] visit;

    private int row;

    private int col;

    private boolean in(int x, int y) {
        return 0 <= x && x < row && 0 <= y && y < col;
    }

    private int count = 0;

    private boolean allVisit() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (!visit[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    private class Node {
        int x;

        int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public int orangesRotting(int[][] grid) {
        row = grid.length;
        col = grid[0].length;
        visit = new boolean[row][col];
        Queue<Node> nodes = new LinkedList<>();
        int onenumber = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] != 1) {
                    visit[i][j] = true;
                }
                if (grid[i][j] == 1) {
                    onenumber++;
                }
                if (grid[i][j] == 2) {
                    nodes.add(new Node(i, j));
                }
            }
        }
if (onenumber==0){
    return 0;
}
        while (!nodes.isEmpty()) {
            count++;
            Queue<Node> temp = new LinkedList<>();
            while (!nodes.isEmpty()) {
                Node node = nodes.poll();
                if (dealnode(grid, node.x + 1, node.y)) {
                    temp.add(new Node(node.x + 1, node.y));
                }
                if (dealnode(grid, node.x - 1, node.y)) {
                    temp.add(new Node(node.x - 1, node.y));
                }
                if (dealnode(grid, node.x, node.y + 1)) {
                    temp.add(new Node(node.x, node.y + 1));
                }
                if (dealnode(grid, node.x, node.y - 1)) {
                    temp.add(new Node(node.x, node.y - 1));
                }

            }
            nodes = temp;
        }

        if (!allVisit()) {
            return -1;
        }
        return count - 1;
    }

    private boolean dealnode(int[][] grid, int x, int y) {
        if (!in(x, y)) {
            return false;
        }
        if (grid[x][y] != 1 || visit[x][y]) {
            return false;
        }
        visit[x][y] = true;
        return true;
    }
}

public class HW994 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.orangesRotting(new int[][]{{2, 1, 1}, {1, 1, 0}, {0, 1, 1}}));
        System.out.println(solution.orangesRotting(new int[][]{{2, 1, 1}, {0, 1, 1}, {1, 0, 1}}));
        System.out.println(solution.orangesRotting(new int[][]{{0, 2}}));
    }
}
