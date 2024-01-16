package CodeTop.HW.HW53;

/**
 * @ClassName HW53
 * @Description TODO
 * @Author point
 * @Date 2023/12/23 16:03
 * @Version 1.0
 */
class Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i] = Math.max(nums[i], nums[i] + dp[i - 1]);
            max = Math.max(max, dp[i]);
        }
        return max;
    }
}

public class HW53 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.maxSubArray(new int[]{
                -2,1,-3,4,-1,2,1,-5,4
        }));  System.out.println(solution.maxSubArray(new int[]{
                1
        }));  System.out.println(solution.maxSubArray(new int[]{
                5,4,-1,7,8
        }));
    }
}
