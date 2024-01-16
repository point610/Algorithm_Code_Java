package LeetCode.Middle.LeetCode494;

/**
 * @ClassName LeetCode494
 * @Description TODO
 * @Author point
 * @Date 2023/11/17 23:53
 * @Version 1.0
 */
class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int sum = 0;
        int size = nums.length;
        for (int i = 0; i < size; i++) {
            sum += nums[i];
        }
        if (Math.abs(sum) < Math.abs(target)) {
            return 0;
        }
        int length = sum * 2 + 1;
        int[][] dp = new int[size][length];
        dp[0][sum + nums[0]]++;
        dp[0][sum - nums[0]]++;

        for (int i = 1; i < size; i++) {
            for (int j = -sum; j <= sum; j++) {
                if (j + nums[i] > sum) {
                    dp[i][sum + j] += dp[i - 1][sum + j - nums[i]];
                } else if (j - nums[i] < -sum) {
                    dp[i][sum + j] += dp[i - 1][sum + j + nums[i]];
                } else {
                    dp[i][sum + j] += dp[i - 1][sum + j - nums[i]] + dp[i - 1][sum + j + nums[i]];
                }
            }

        }

        return dp[size - 1][sum + target];
    }
}

public class LeetCode494 {
}
