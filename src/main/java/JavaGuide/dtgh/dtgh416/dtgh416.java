package JavaGuide.dtgh.dtgh416;

class Solution {
    public boolean canPartition(int[] nums) {
        int size = nums.length;
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        if (sum % 2 == 1) {
            return false;
        }
        int target = sum / 2;
        boolean[][] dp = new boolean[size][target + 1];

        // 只放第一个
        if (nums[0] < target) {
            dp[0][nums[0]] = true;
        }

        for (int i = 1; i < size; i++) {
            for (int j = 0; j <= target; j++) {
                // 从上一个中取值
                dp[i][j] = dp[i - 1][j];
                if (j == nums[i]) {
                    dp[i][j] = true;
                }
                if (nums[i] < j) {
                    // dp[i - 1][j]为不取当前的值
                    // dp[i - 1][j-num[i]]为取当前的数值
                    dp[i][j] = dp[i - 1][j] || dp[i - 1][j - nums[i]];
                }
            }
        }

        return dp[size - 1][target];
    }
}

public class dtgh416 {
}
