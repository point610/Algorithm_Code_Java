package LeetCode.Middle.LeetCode221;

/**
 * @ClassName LeetCode221
 * @Description TODO
 * @Author point
 * @Date 2023/11/17 22:54
 * @Version 1.0
 */
class Solution {
    public int maximalSquare(char[][] matrix) {
        if (matrix == null || matrix.length < 1 || matrix[0].length < 1) {
            return 0;
        }
        int row = matrix.length;
        int col = matrix[0].length;
        int res = 0;
        int[][] dp = new int[row][col];
        for (int i = 0; i < row; i++) {
            dp[i][0] = matrix[i][0] - '0';
            res = Math.max(res, dp[i][0]);
        }
        for (int i = 0; i < col; i++) {
            dp[0][i] = matrix[0][i] - '0';
            res = Math.max(res, dp[0][i]);
        }
        for (int i = 1; i < row; i++) {
            for (int j = 1; j < col; j++) {
                if (matrix[i][j] == '1') {
                    dp[i][j] = Math.min(dp[i - 1][j], Math.min(dp[i][j - 1], dp[i - 1][j - 1])) + 1;
                    res = Math.max(res, dp[i][j]);
                }

            }
        }
        return res * res;

    }
}

public class LeetCode221 {
}
