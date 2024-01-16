package LeetCode.Middle.LeetCode279;

/**
 * @ClassName LeetCode279
 * @Description TODO
 * @Author point
 * @Date 2023/11/19 23:00
 * @Version 1.0
 */
class Solution {
    public int numSquares(int n) {
        int[] dp = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            dp[i] = i;
            for (int j = 1; i - j * j >= 0; j++) {
                dp[i] = Math.min(dp[i], dp[i - j * j] + 1);
            }
        }
        return dp[n];
    }
}

public class LeetCode279 {
}
