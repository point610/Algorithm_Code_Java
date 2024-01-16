package LeetCode.Easy.LeetCode2373;

/**
 * @ClassName LeetCode2373
 * @Description TODO
 * @Author point
 * @Date 2023/9/30 17:41
 * @Version 1.0
 */
class Solution {
    int getmax(int[][] grid, int x, int y) {
        int max = 0;
        for (int i = x - 1; i <= x + 1; i++) {
            for (int j = y - 1; j <= y + 1; j++) {
                max = Math.max(max, grid[i][j]);
            }
        }
        return max;
    }

    public int[][] largestLocal(int[][] grid) {
        int row = grid.length;
        int column = grid[0].length;
        int[][] res = new int[row - 2][column - 2];
        for (int i = 1; i < row - 1; i++) {
            for (int j = 1; j < column - 1; j++) {
                res[i-1][j-1] = getmax(grid, i, j);
            }
        }
        return res;
    }
}

public class LeetCode2373 {
}
