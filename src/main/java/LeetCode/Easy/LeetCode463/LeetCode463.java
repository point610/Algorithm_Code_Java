package LeetCode.Easy.LeetCode463;

/**
 * @ClassName LeetCode463
 * @Description TODO
 * @Author point
 * @Date 2023/7/28 0:45
 * @Version 1.0
 */
class Solution {
    public int islandPerimeter(int[][] grid) {
        int row = grid.length;
        int column = grid[0].length;
        int sum = 0;
        int cover = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (grid[i][j] == 1) {
                    sum++;
                }
                if (j != column - 1) {
                    if (grid[i][j] == 1 && grid[i][j + 1] == 1) {
                        cover++;
                    }
                }
                if (i != row - 1) {
                    if (grid[i][j] == 1 && grid[i + 1][j] == 1) {
                        cover++;
                    }
                }
            }
        }
        return sum * 4 - cover * 2;
    }
}

public class LeetCode463 {
}
