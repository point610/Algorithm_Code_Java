package LeetCode.Easy.MS.MS1716;

/**
 * @ClassName MS1716
 * @Description TODO
 * @Author point
 * @Date 2023/10/12 15:48
 * @Version 1.0
 */
class Solution {
    public int massage(int[] nums) {
        int size = nums.length;
        if (size == 0) {
            return 0;
        }
        if (size == 1) {
            return nums[0];
        }

        int[] dp = new int[size];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < size; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
        }
        return dp[size - 1];

    }
}

public class MS1716 {
}
