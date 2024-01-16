package CodeTop.HW.HW200;

/**
 * @ClassName HW200
 * @Description TODO
 * @Author point
 * @Date 2023/12/25 16:43
 * @Version 1.0
 */
class Solution {
    private boolean[][] visit;

    int row;

    int col;

    private boolean in(int x, int y) {
        return 0 <= x && x < row && 0 <= y && y < col;
    }

    void DFS(char[][] grid, int x, int y) {
        if (!in(x, y) || visit[x][y] || grid[x][y] == '0') {
            return;
        }
        visit[x][y] = true;

        DFS(grid, x + 1, y);
        DFS(grid, x - 1, y);
        DFS(grid, x, y + 1);
        DFS(grid, x, y - 1);

    }

    public int numIslands(char[][] grid) {
        row = grid.length;
        col = grid[0].length;
        int count = 0;
        visit = new boolean[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == '1' && !visit[i][j]) {
                    DFS(grid, i, j);
                    count++;
                }
            }
        }
        return count;
    }
}

public class HW200 {
}
