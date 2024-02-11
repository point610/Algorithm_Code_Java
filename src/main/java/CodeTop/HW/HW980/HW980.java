package CodeTop.HW.HW980;

class Solution {
    private final int[][] dir = new int[][]{{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    private int sumstep;

    private int row;
    private int col;
    private int count;
    private int[][] grid;
    private boolean[][] visit;

    private boolean in(int x, int y) {
        return 0 <= x && x < row && 0 <= y && y < col && grid[x][y] != -1;
    }

    private boolean end(int x, int y) {
        return grid[x][y] == 2;
    }

    public int uniquePathsIII(int[][] grid) {
        this.grid = grid;
        count = 0;
        sumstep = 0;
        row = grid.length;
        col = grid[0].length;
        int startX = 0;
        int startY = 0;
        visit = new boolean[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == 1) {
                    startX = i;
                    startY = j;
                    sumstep++;
                } else if (grid[i][j] == 0) {
                    sumstep++;
                }
            }
        }
        DFS(startX, startY, 0);

        return count;
    }

    private void DFS(int x, int y, int tempstep) {
        if (!in(x, y) || visit[x][y]) {
            return;
        }
        if (end(x, y)) {
            if (tempstep == sumstep) {
                count++;
            }
            return;
        }
        if (tempstep >= sumstep) {
            return;
        }

        visit[x][y] = true;
        for (int[] iiii : dir) {
            DFS(x + iiii[0], y + iiii[1], tempstep + 1);
        }
        visit[x][y] = false;
    }
}

public class HW980 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.uniquePathsIII(new int[][]{{1, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 2, -1}}));
        System.out.println(solution.uniquePathsIII(new int[][]{{1, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 2}}));
        System.out.println(solution.uniquePathsIII(new int[][]{{0, 1}, {2, 0}}));
    }
}
