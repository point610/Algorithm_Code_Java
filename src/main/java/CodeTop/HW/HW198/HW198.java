package CodeTop.HW.HW198;

/**
 * @ClassName HW198
 * @Description TODO
 * @Author point
 * @Date 2023/12/29 16:35
 * @Version 1.0
 */
class Solution {
    public int rob(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int size = nums.length;
        int[] dp = new int[size + 1];
        dp[0] = 0;
        dp[1] = nums[1];
        for (int i = 2; i <= size; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i - 1]);

        }
        return dp[size];
    }
}

public class HW198 {
}
