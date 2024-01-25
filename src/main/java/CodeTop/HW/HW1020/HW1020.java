package CodeTop.HW.HW1020;

class Solution {
    int row;
    int col;

    boolean[][] visit;
    int tempcount;
    boolean bian;

    private boolean in(int x, int y) {
        return 0 <= x && x < row && 0 <= y && y < col;
    }

    private boolean edge(int x, int y) {
        return x == 0 || y == 0 || x == row - 1 || y == col - 1;
    }

    private void DFS(int x, int y, int[][] grid) {
        if (!in(x, y) || visit[x][y] || grid[x][y] == 0) {
            return;
        }
        visit[x][y] = true;
        tempcount++;
        if (edge(x, y)) {
            bian = true;
        }

        DFS(x - 1, y, grid);
        DFS(x, y - 1, grid);
        DFS(x, y + 1, grid);
        DFS(x + 1, y, grid);
    }

    public int numEnclaves(int[][] grid) {
        row = grid.length;
        col = grid[0].length;
        int count = 0;
        visit = new boolean[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                tempcount = 0;
                bian = false;

                DFS(i, j, grid);

                if (!bian) {
                    count += tempcount;
                }
            }
        }

        return count;
    }
}

public class HW1020 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.numEnclaves(new int[][]{{0, 0, 0, 0}, {1, 0, 1, 0}, {0, 1, 1, 0}, {0, 0, 0, 0}}));
        System.out.println(solution.numEnclaves(new int[][]{{0, 1, 1, 0}, {0, 0, 1, 0}, {0, 0, 1, 0}, {0, 0, 0, 0}}));
    }
}
