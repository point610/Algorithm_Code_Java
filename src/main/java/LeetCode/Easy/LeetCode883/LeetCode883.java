package LeetCode.Easy.LeetCode883;

/**
 * @ClassName LeetCode883
 * @Description TODO
 * @Author point
 * @Date 2023/8/12 13:35
 * @Version 1.0
 */
class Solution {
    public int projectionArea(int[][] grid) {

        int xy = grid.length;
        // foot
        int footArea = 0;
        for (int i = 0; i < xy; i++) {
            int maxOne = 0;
            int maxTwo = 0;
            for (int j = 0; j < xy; j++) {
                if (grid[i][j] != 0) {
                    footArea++;
                }
                maxOne = Math.max(maxOne, grid[i][j]);
                maxTwo = Math.max(maxTwo, grid[j][i]);
            }
            footArea += maxOne;
            footArea += maxTwo;
        }

        return footArea;
    }


}

public class LeetCode883 {
}
