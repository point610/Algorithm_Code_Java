package CodeTop.TX.TX322;

import java.util.Arrays;

class Solution {
    public int coinChange(int[] coins, int amount) {
        int size = coins.length;
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, Integer.MAX_VALUE - 6);
        Arrays.sort(coins);
        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            for (int iii : coins) {
                if (i - iii < 0) {
                    break;
                }
                dp[i] = Math.min(dp[i], dp[i - iii] + 1);
            }
        }
        if (dp[amount] == Integer.MAX_VALUE - 6) {
            return -1;
        }
        return dp[amount];
    }
}

public class TX322 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.coinChange(new int[]{1, 2, 5}, 11));
        System.out.println(solution.coinChange(new int[]{2}, 3));
        System.out.println(solution.coinChange(new int[]{1}, 0));
    }
}
