package CodeTop.HW.HW918;

/**
 * @ClassName HW918
 * @Description TODO
 * @Author point
 * @Date 2023/12/28 10:59
 * @Version 1.0
 */
class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int size = nums.length;
        int[] dp = new int[size];
        int[] dp2 = new int[size];
        dp[0] = nums[0];
        dp2[0] = nums[0];
        int sum = nums[0];
        for (int i = 1; i < size; i++) {
            dp[i] = Math.min(nums[i], nums[i] + dp[i - 1]);
            sum += nums[i];
        }
        for (int i = 1; i < size; i++) {
            dp2[i] = Math.max(nums[i], nums[i] + dp2[i - 1]);
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            max = Math.max(max, dp2[i]);
        }
        if (max < 0) {
            return max;
        }
        max = Integer.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            max = Math.max(Math.max(max, dp2[i]), sum - dp[i]);
        }
        return Math.max(max, sum);
    }
}

public class HW918 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.maxSubarraySumCircular(new int[]{-3, -2, -3}));
        System.out.println(solution.maxSubarraySumCircular(new int[]{1, -2, 3, -2}));
        System.out.println(solution.maxSubarraySumCircular(new int[]{1, -2, 3, -2}));
        System.out.println(solution.maxSubarraySumCircular(new int[]{5, -3, 5}));
        System.out.println(solution.maxSubarraySumCircular(new int[]{3, -2, 2, -3}));
    }
}
