
package JavaGuide.dtgh.dtgh518;

class Solution {
    public int change(int amount, int[] coins) {
        int size = coins.length;
        int[] dp = new int[amount + 1];
        dp[0] = 1;

        for (int coin : coins) {
            for (int i = coin; i <= amount; i++) {
                if (i >= coin) {
                    dp[i] += dp[i-coin];
                }
            }
        }

        return dp[amount];
    }
}

public class dtgh518 {
}
