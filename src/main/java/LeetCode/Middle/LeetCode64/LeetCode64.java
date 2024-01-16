package LeetCode.Middle.LeetCode64;

/**
 * @ClassName LeetCode64
 * @Description TODO
 * @Author point
 * @Date 2023/8/29 21:31
 * @Version 1.0
 */
class Solution {
    public int minPathSum(int[][] grid) {
        int row = grid.length;
        int column = grid[0].length;
        for (int i = 1; i < column; i++) {
            grid[0][i] += grid[0][i - 1];
        }
        for (int i = 1; i < row; i++) {
            grid[i][0] += grid[i - 1][0];
        }

        for (int i = 1; i < row; i++) {
            for (int j = 1; j < column; j++) {
                grid[i][j] = grid[i][j] + Math.min(grid[i][j - 1], grid[i - 1][j]);
            }
        }
        return grid[row - 1][column - 1];
    }
}

public class LeetCode64 {
}
