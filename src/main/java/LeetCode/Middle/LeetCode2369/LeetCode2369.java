package LeetCode.Middle.LeetCode2369;

class Solution {
    public boolean validPartition(int[] nums) {
        int size = nums.length;
        boolean[] dp = new boolean[size + 1];
        dp[0] = true;

        for (int i = 1; i <= size; i++) {
            if (i >= 2) {
                dp[i] = dp[i - 2] && two(nums[i - 1], nums[i - 2]);
            }
            if (i >= 3) {
                // dp[i] 为检查2的时候可能为true
                dp[i] = dp[i] || dp[i - 3] && two(nums[i - 3], nums[i - 2], nums[i - 1]);
            }
        }

        return dp[size];
    }

    private boolean two(int one, int two) {
        return one == two;
    }

    private boolean two(int one, int two, int three) {
        return (one == two && one == three) || (one + 1 == two && two + 1 == three);
    }

}

public class LeetCode2369 {
}
