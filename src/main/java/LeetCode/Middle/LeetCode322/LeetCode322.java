package LeetCode.Middle.LeetCode322;

import java.util.Arrays;

/**
 * @ClassName LeetCode322
 * @Description TODO
 * @Author point
 * @Date 2023/11/24 22:36
 * @Version 1.0
 */
class Solution {
    public int coinChange(int[] coins, int amount) {
        int max = amount + 1;
        int[] dp = new int[max];
        int size = coins.length;
        Arrays.fill(dp, max);
        dp[0] = 0;
        for (int i = 0; i < max; i++) {
            for (int j = 0; j < size; j++) {
                int current = coins[j];
                if (i - current >= 0) {
                    dp[i] = Math.min(dp[i], dp[i - current] + 1);
                }
            }
        }
        return dp[max - 1] > amount ? -1 : dp[max - 1];
    }
}

public class LeetCode322 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.coinChange(new int[]{186, 419, 83, 408}, 6249));
    }
}
