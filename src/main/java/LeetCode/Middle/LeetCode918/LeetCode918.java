package LeetCode.Middle.LeetCode918;

/**
 * @ClassName LeetCode918
 * @Description TODO
 * @Author point
 * @Date 2023/7/20 18:09
 * @Version 1.0
 */
class Solution {

    public int maxSubarraySumCircular(int[] nums) {
        int size = nums.length;
        int sum = 0;
        // ++++
        int max = -30000;
        int one = -30000;
        int two = 30000;
        int min = 30000;
        for (int i = 0; i < size; i++) {
            one = Math.max(nums[i], nums[i] + one);
            max = Math.max(max, one);

            two = Math.min(nums[i], nums[i] + two);
            min = Math.min(min, two); sum += nums[i];
        }
        if (max < 0) {
            // 数组中的数值都小于0
            return max;
        }
        return Math.max(max, sum - min);
    }
}

public class LeetCode918 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.maxSubarraySumCircular(new int[]{1, -2, 3, -2}));
    }
}
