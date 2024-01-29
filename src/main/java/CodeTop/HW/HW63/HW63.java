package CodeTop.HW.HW63;

class Solution {
    private int ZHANGAI = 1;
    private int row;
    private int col;


    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        row = obstacleGrid.length;
        col = obstacleGrid[0].length;
        int[][] lll = new int[row][col];

        if (obstacleGrid[row - 1][col - 1] == ZHANGAI||obstacleGrid[0][0] == ZHANGAI) {
            return 0;
        }

        lll[0][0] = 1;
        for (int i = 1; i < row; i++) {
            if (obstacleGrid[i][0] != ZHANGAI) {
                lll[i][0] = lll[i - 1][0];
            } else {
                break;
            }
        }
        for (int i = 1; i < col; i++) {
            if (obstacleGrid[0][i] != ZHANGAI) {
                lll[0][i] = lll[0][i - 1];
            } else {
                break;
            }
        }

        for (int i = 1; i < row; i++) {
            for (int j = 1; j < col; j++) {
                if (obstacleGrid[i][j] == ZHANGAI) {
                    continue;
                }
                lll[i][j] = lll[i - 1][j] + lll[i][j - 1];
            }
        }

        return lll[row - 1][col - 1];
    }
}

public class HW63 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.uniquePathsWithObstacles(new int[][]{{0, 1}, {0, 0}}));
        System.out.println(solution.uniquePathsWithObstacles(new int[][]{{0, 0, 0}, {0, 1, 0}, {0, 0, 0}}));
    }
}
