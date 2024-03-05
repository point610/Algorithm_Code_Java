package CodeTop.HW2.HW200;
class Solution {
    private int row;
    private int col;
    private boolean[][] visit;
    private char[][] grid;

    private boolean in(int x, int y) {
        return 0 <= x && x < row && 0 <= y && y < col;
    }

    private void DFS(int x, int y) {
        if (!in(x, y) || visit[x][y] || grid[x][y] == '0') {
            return;
        }
        visit[x][y] = true;
        DFS(x - 1, y);
        DFS(x, y - 1);
        DFS(x, y + 1);
        DFS(x + 1, y);
    }

    public int numIslands(char[][] grid) {
        row = grid.length;
        col = grid[0].length;
        this.grid = grid;
        visit = new boolean[row][col];

        int times = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (!visit[i][j] && grid[i][j] == '1') {
                    times++;
                    DFS(i, j);
                }

            }
        }
        return times;
    }
}

public class HW200 {
}
