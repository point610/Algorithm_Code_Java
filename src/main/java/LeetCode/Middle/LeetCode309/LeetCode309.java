package LeetCode.Middle.LeetCode309;

/**
 * @ClassName LeetCode309
 * @Description TODO
 * @Author point
 * @Date 2023/11/24 22:07
 * @Version 1.0
 */
class Solution {
    public int maxProfit(int[] prices) {
        int size = prices.length;
        int[][] dp = new int[size][3];
        dp[0][0] = 0;
        dp[0][1] = -prices[0];
        dp[0][2] = 0;
        for (int i = 1; i < size; i++) {
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][2]);
            dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][0] - prices[i]);
            dp[i][2] = dp[i - 1][1] + prices[i];
        }
        return Math.max(dp[size - 1][0], dp[size - 1][2]);
    }
}

public class LeetCode309 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.maxProfit(new int[]{1, 2, 3, 0, 2}));
    }
}
