package CodeTop.HW.HW322;

import java.util.Arrays;

/**
 * @ClassName HW322
 * @Description TODO
 * @Author point
 * @Date 2023/12/26 9:13
 * @Version 1.0
 */
class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;
        for (int i = 0; i < amount + 1; i++) {
            for (int j = 0; j < coins.length; j++) {
                int current = coins[j];
                if (i - current >= 0) {
                    dp[i] = Math.min(dp[i], dp[i - current] + 1);
                }
            }
        }
        // 需要排除找不到的情况
        return dp[amount] > amount ? -1 : dp[amount];
    }
}

public class HW322 {
}
