package LeetCode.Easy.LeetCode1260;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName LeetCode1260
 * @Description TODO
 * @Author point
 * @Date 2023/8/19 0:27
 * @Version 1.0
 */
class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        for (int i = 0; i < k; i++) {
            change(grid);
        }
        int row = grid.length;
        int column = grid[0].length;
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < row; i++) {
            List<Integer> temp = new ArrayList<>();
            for (int j = 0; j < column; j++) {
                temp.add(grid[i][j]);
            }
            res.add(temp);
        }
        return res;
    }

    private void change(int[][] grid) {

        int row = grid.length;
        int column = grid[0].length;
        int[] temp = new int[row];
        for (int i = 0; i < row; i++) {
            temp[i] = grid[i][column - 1];
        }
        for (int i = 0; i < row; i++) {
            for (int j = column - 1; j > 0; j--) {
                grid[i][j] = grid[i][j - 1];
            }
        }

        // 后两步处理
        for (int i = 1; i < row; i++) {
            grid[i][0] = temp[i - 1];
        }
        grid[0][0] = temp[row - 1];

    }
}

public class LeetCode1260 {
}
