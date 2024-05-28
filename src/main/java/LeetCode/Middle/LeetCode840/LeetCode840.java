package LeetCode.Middle.LeetCode840;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int numMagicSquaresInside(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int count = 0;
        for (int i = 0; i <= row - 3; i++) {
            for (int j = 0; j <= col - 3; j++) {
                // 检查是否为幻方
                if (is(grid, i, j)) {
                    count++;
                }
            }
        }
        return count;
    }

    private boolean is(int[][] grid, int row, int col) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (set.contains(grid[row + i][col + j]) || grid[row + i][col + j] < 1 || grid[row + i][col + j] > 9) {
                    return false;
                } else {
                    set.add(grid[row + i][col + j]);
                }
            }
        }
        int temp = 15;
        for (int i = 0; i < 3; i++) {
            int sum = 0;
            for (int j = 0; j < 3; j++) {
                sum += grid[row + i][col + j];
            }
            if (sum != temp) {
                return false;
            }
        }

        for (int i = 0; i < 3; i++) {
            int sum = 0;
            for (int j = 0; j < 3; j++) {
                sum += grid[row + j][col + i];
            }
            if (sum != temp) {
                return false;
            }
        }

        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += grid[row + i][col + i];
        }
        if (sum != temp) {
            return false;
        }

        sum = 0;

        for (int i = 0; i < 3; i++) {
            sum += grid[row + i][col + 2 - i];
        }
        if (sum != temp) {
            return false;
        }

        return true;
    }

}

public class LeetCode840 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.numMagicSquaresInside(new int[][]{{4, 3, 8, 4}, {9, 5, 1, 9}, {2, 7, 6, 2}}));
    }
}
