package LeetCode.Hard.LeetCode1289;

import java.util.*;

/**
 * @ClassName LeetCode1289
 * @Description TODO
 * @Author point
 * @Date 2023/8/10 16:42
 * @Version 1.0
 */
class Solution {
    public int minFallingPathSum(int[][] grid) {
        int row = grid.length;
        if (row == 1) {
            Arrays.sort(grid[0]);
            return grid[0][0];
        }
        int column = grid.length;

        for (int i = 1; i < row; i++) {
            int one = 0;
            int oneMin = 100000000;
            int two = 0;
            int twoMin = 100000000;
            for (int j = 0; j < column; j++) {
                if (oneMin > grid[i - 1][j]) {
                    one = j;
                    oneMin = grid[i - 1][j];
                }

            }
            for (int j = 0; j < column; j++) {
                if (j != one && twoMin > grid[i - 1][j]) {
                    two = j;
                    twoMin = grid[i - 1][j];
                }

            }

            // 开始动态规划
            for (int j = 0; j < column; j++) {
                if (j != one) {
                    grid[i][j] += oneMin;
                } else {
                    grid[i][j] += twoMin;
                }
            }

        }
        int res = 100000000;
        for (int i = 0; i < column; i++) {
            if (res > grid[row - 1][i]) {
                res = grid[row - 1][i];
            }
        }
        return res;
    }
}

public class LeetCode1289 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.minFallingPathSum(new int[][]{{50, -18, -38, 39, -20, -37, -61, 72, 22, 79},
                {82, 26, 30, -96, -1, 28, 87, 94, 34, -89},
                {55, -50, 20, 76, -50, 59, -58, 85, 83, -83},
                {39, 65, -68, 89, -62, -53, 74, 2, -70, -90},
                {1, 57, -70, 83, -91, -32, -13, 49, -11, 58},
                {-55, 83, 60, -12, -90, -37, -36, -27, -19, -6},
                {76, -53, 78, 90, 70, 62, -81, -94, -32, -57},
                {-32, -85, 81, 25, 80, 90, -24, 10, 27, -55},
                {39, 54, 39, 34, -45, 17, -2, -61, -81, 85},
                {-77, 65, 76, 92, 21, 68, 78, -13, 39, 22}}));
    }
}
