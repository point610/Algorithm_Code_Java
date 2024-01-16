package LeetCode.Easy.LeetCode892;

/**
 * @ClassName LeetCode892
 * @Description TODO
 * @Author point
 * @Date 2023/8/12 15:20
 * @Version 1.0
 */
class Solution {
    public int surfaceArea(int[][] grid) {
        int sum = 0;
        int z = 0;
        int x = 0;
        int y = 0;
        int n = grid.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sum += grid[i][j];
                if ( grid[i][j] !=0){
                    z += grid[i][j] - 1;
                }
                if (j != 0) {
                    x += Math.min(grid[i][j], grid[i][j - 1]);
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j != 0) {
                    y += Math.min(grid[j][i], grid[j - 1][i]);
                }
            }
        }


        return sum * 6 - x * 2 - y * 2 - z * 2;
    }
}

public class LeetCode892 {
}
