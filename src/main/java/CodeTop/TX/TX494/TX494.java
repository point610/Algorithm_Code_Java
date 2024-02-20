package CodeTop.TX.TX494;


class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int size = nums.length;
        int sum = 0;
        for (int ii : nums) {
            sum += ii;
        }
        if (sum - target < 0 || (sum - target) % 2 != 0) {
            return 0;
        }

        int newTarget = (sum - target) / 2;
        //表示在数组 nums 的前 i 个数中选取元素，使得这些元素之和等于 j 的方案数
        int[][] dp = new int[size + 1][newTarget + 1];
        dp[0][0] = 1;
        for (int i = 1; i <= size; i++) {
            int current = nums[i - 1];
            for (int j = 0; j <= newTarget; j++) {
                // 从上一个数中获取
                dp[i][j] = dp[i - 1][j];
                if (j - current >= 0) {
                    // 对符合条件的数量进行累加
                    dp[i][j] += dp[i - 1][j - current];
                }
            }
        }

        return dp[size][newTarget];
    }
}

public class TX494 {
}
