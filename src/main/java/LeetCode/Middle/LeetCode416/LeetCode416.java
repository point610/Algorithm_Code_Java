package LeetCode.Middle.LeetCode416;

/**
 * @ClassName LeetCode416
 * @Description TODO
 * @Author point
 * @Date 2023/10/8 23:24
 * @Version 1.0
 */
class Solution {
    public boolean canPartition(int[] nums) {
        int size = nums.length;
        if (size < 2) {
            return false;
        }
        int sum = 0;
        int max = 0;
        for (int i = 0; i < size; i++) {
            sum += nums[i];
            max = Math.max(max, nums[i]);
        }
        if (sum % 2 == 1) {
            return false;
        }
        int target = sum / 2;
        if (max > target) {
            return false;
        }
        boolean[][] dp = new boolean[size][target + 1];
        for (int i = 0; i < size; i++) {
            dp[i][0] = true;
        }
        dp[0][nums[0]] = true;
        for (int i = 1; i < size; i++) {
            int temp = nums[i];
            for (int j = 1; j < target + 1; j++) {

                if (j >= temp) {
                    dp[i][j] = dp[i - 1][j] | dp[i - 1][j - temp];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[size - 1][target];
    }
}

public class LeetCode416 {
}
