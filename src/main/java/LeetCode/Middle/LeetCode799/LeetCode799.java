package LeetCode.Middle.LeetCode799;

class Solution {
    public double champagneTower(int poured, int query_row, int query_glass) {
        double[][] dp = new double[query_row + 1][query_row + 1];

        dp[0][0] = poured;

        for (int i = 1; i <= query_row; i++) {

            for (int j = 0; j <= i; j++) {

                if (j == 0) {
                    dp[i][j] += Math.max(0, dp[i - 1][j] - 1) / 2;
                } else if (j == i) {
                    dp[i][j] += Math.max(0, dp[i - 1][j - 1] - 1) / 2;
                } else {
                    dp[i][j] += Math.max(0, dp[i - 1][j] - 1) / 2;
                    dp[i][j] += Math.max(0, dp[i - 1][j - 1] - 1) / 2;
                }
            }
        }

        return Math.min(1, dp[query_row][query_glass]);
    }
}

public class LeetCode799 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.champagneTower(2, 1, 1));
    }
}
