package LeetCode.Easy.LeetCode2500;

import java.util.Arrays;

/**
 * @ClassName LeetCode2500
 * @Description TODO
 * @Author point
 * @Date 2023/7/27 20:25
 * @Version 1.0
 */
class Solution {
    public int deleteGreatestValue(int[][] grid) {
        int row = grid.length;
        for (int i = 0; i < row; i++) {
            Arrays.sort(grid[i]);
        }
        int sum = 0;
        int column = grid[0].length;

        for (int i = 0; i < column; i++) {
            int max = 0;
            for (int j = 0; j < row; j++) {
                max = Math.max(max, grid[j][i]);
            }
            sum += max;
        }
        return sum;

    }
}

public class LeetCode2500 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.deleteGreatestValue(new int[][]{{1, 2, 4}, {3, 3, 1}}));
    }
}
