package LeetCode.Easy.LeetCode1351;

/**
 * @ClassName LeetCode1351
 * @Description TODO
 * @Author point
 * @Date 2023/9/17 11:13
 * @Version 1.0
 */
class Solution {
    public int countNegatives(int[][] grid) {
        int row = grid.length;
        int column = grid[0].length;
        int number = 0;
        for (int i = row - 1; i >= 0; i--) {
            for (int j = column-1; j >= 0; j--) {
                if (grid[i][j] >= 0) {
                    break;
                }
                number++;
            }
        }
        return number;
    }
}

public class LeetCode1351 {
}
