package CodeTop.HW.HW695;

/**
 * @ClassName HW695
 * @Description TODO
 * @Author point
 * @Date 2023/12/28 15:29
 * @Version 1.0
 */
class Solution {
    private int row;

    private int col;

    private int count = 0;

    private boolean[][] visit;

    private boolean in(int x, int y) {
        return 0 <= x && x < row && 0 <= y && y < col;
    }

    void DFS(int[][] list, int x, int y) {
        if (!in(x, y) || visit[x][y] || list[x][y] == 0) {
            return;
        }
        count++;
        visit[x][y] = true;
        DFS(list, x + 1, y);
        DFS(list, x - 1, y);
        DFS(list, x, y + 1);
        DFS(list, x, y - 1);

    }

    public int maxAreaOfIsland(int[][] grid) {
        row = grid.length;
        col = grid[0].length;
        visit = new boolean[row][col];
        int max = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (!visit[i][j] && grid[i][j] == 1) {
                    count = 0;
                    DFS(grid, i, j);
                    max = Math.max(max, count);
                }
            }
        }
        return max;
    }
}

public class HW695 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.maxAreaOfIsland(new int[][]{{1, 1, 0, 0, 0}, {1, 1, 0, 0, 0}, {0, 0, 0, 1, 1}, {0, 0, 0, 1, 1}}));
        System.out.println(solution.maxAreaOfIsland(new int[][]{{0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0}, {0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0}, {0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0}}));
    }
}
