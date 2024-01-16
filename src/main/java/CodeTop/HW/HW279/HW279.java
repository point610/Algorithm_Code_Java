package CodeTop.HW.HW279;

/**
 * @ClassName HW279
 * @Description TODO
 * @Author point
 * @Date 2023/12/29 10:55
 * @Version 1.0
 */
class Solution {
    public int numSquares(int n) {
        int[] dp = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            // 都为1 相加的情况
            dp[i] = i;
            for (int j = 1; i - j * j >= 0; j++) {
                dp[i] = Math.min(dp[i], dp[i - j * j] + 1);
            }
        }

        return dp[n];
    }
}

public class HW279 {
}
