package LeetCode.Easy.LCR101;

/**
 * @ClassName LCR101
 * @Description TODO
 * @Author point
 * @Date 2023/10/8 22:42
 * @Version 1.0
 */
class Solution {

    public boolean canPartition(int[] nums) {
        int sum = 0;
        int size = nums.length;
        int maxnumber = 0;
        if (size < 2) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            sum += nums[i];
            maxnumber = Math.max(maxnumber, nums[i]);
        }
        if (sum % 2 == 1) {
            return false;
        }
        int target = sum / 2;
        if (maxnumber > sum / 2) {
            return false;
        }

        boolean[][] dp = new boolean[size][target + 1];
        for (int i = 0; i < size; i++) {
            dp[i][0] = true;
        }
        dp[0][nums[0]] = true;
        for (int i = 1; i < size; i++) {
            int num = nums[i];
            for (int j = 1; j <= target; j++) {
                if (j >= num) {
                    dp[i][j] = dp[i - 1][j] | dp[i - 1][j - num];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[size - 1][target];
    }
}

public class LCR101 {
}
