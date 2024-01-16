package LeetCode.Middle.LeetCode63;

/**
 * @ClassName LeetCode63
 * @Description TODO
 * @Author point
 * @Date 2023/10/25 22:51
 * @Version 1.0
 */
class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int row = obstacleGrid.length;
        int col = obstacleGrid[0].length;
        if (obstacleGrid[row - 1][col - 1] == 1) {
            return 0;
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (obstacleGrid[i][j] == 1) {
                    obstacleGrid[i][j] = -1;
                }
            }
        }
        for (int i = 0; i < row; i++) {
            if (obstacleGrid[i][0] == -1) {
                break;
            }
            obstacleGrid[i][0] = 1;
        }
        for (int i = 0; i < col; i++) {
            if (obstacleGrid[0][i] == -1) {
                break;
            }
            obstacleGrid[0][i] = 1;
        }

        for (int i = 1; i < row; i++) {
            for (int j = 1; j < col; j++) {
                if (obstacleGrid[i][j] == -1) {
                    continue;
                }
                int up = obstacleGrid[i - 1][j] == -1 ? 0 : obstacleGrid[i - 1][j];
                int left = obstacleGrid[i][j - 1] == -1 ? 0 : obstacleGrid[i][j - 1];
                obstacleGrid[i][j] = up + left;

            }
        }
        return obstacleGrid[row - 1][col - 1];
    }
}

public class LeetCode63 {
}
