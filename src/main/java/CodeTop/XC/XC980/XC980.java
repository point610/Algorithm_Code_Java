package CodeTop.XC.XC980;

class Solution {
    private int[][] grid;
    private boolean[][] visit;
    private int row;
    private int col;
    private int all;
    private int res;
    private int startX;
    private int startY;

    private boolean in(int x, int y) {
        return 0 <= x && x < row && 0 <= y && y < col;
    }

    private void DFS(int x, int y, int times) {
        if (!in(x, y) || grid[x][y] == -1 || visit[x][y]) {
            return;
        }

        if (grid[x][y] == 2) {
            if (times == all) {
                res++;
            }
            return;
        }

        if (times >= all) {
            return;
        }
        visit[x][y] = true;

        DFS(x - 1, y, times + 1);
        DFS(x, y + 1, times + 1);
        DFS(x, y - 1, times + 1);
        DFS(x + 1, y, times + 1);

        visit[x][y] = false;
    }

    public int uniquePathsIII(int[][] grid) {
        this.grid = grid;
        this.row = grid.length;
        this.res = 0;
        this.all = 0;
        this.col = grid[0].length;
        this.visit = new boolean[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == 1) {
                    startX = i;
                    startY = j;
                    all++;
                } else if (grid[i][j] == 0) {
                    all++;
                }
            }
        }

        DFS(startX, startY, 0);

        return res;
    }
}

public class XC980 {
}
