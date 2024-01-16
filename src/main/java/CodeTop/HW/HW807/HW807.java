package CodeTop.HW.HW807;

/**
 * @ClassName HW807
 * @Description TODO
 * @Author point
 * @Date 2023/12/29 16:54
 * @Version 1.0
 */
class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int[][] onemax = new int[row][col];
        int[][] twomax = new int[row][col];

        for (int i = 0; i < row; i++) {
            int max = 0;
            for (int j = 0; j < col; j++) {
                max = Math.max(max, grid[i][j]);
            }
            for (int j = 0; j < col; j++) {
                onemax[i][j] = max;
            }
        }

        for (int i = 0; i < col; i++) {
            int max = 0;
            for (int j = 0; j < row; j++) {
                max = Math.max(max, grid[j][i]);
            }
            for (int j = 0; j < row; j++) {
                twomax[j][i] = max;
            }
        }

        int sum = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                int current = grid[i][j];
                int temp = Math.min(onemax[i][j], twomax[i][j]);
                sum += temp - current;
            }
        }
        return sum;
    }
}

public class HW807 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.maxIncreaseKeepingSkyline(new int[][]
                {{3, 0, 8, 4}, {2, 4, 5, 7}, {9, 2, 6, 3}, {0, 3, 1, 0}}));
    }
}
