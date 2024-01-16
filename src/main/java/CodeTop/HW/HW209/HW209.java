package CodeTop.HW.HW209;

/**
 * @ClassName HW209
 * @Description TODO
 * @Author point
 * @Date 2023/12/28 9:59
 * @Version 1.0
 */
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int size = nums.length;
        int left = 0;
        int right = 0;
        int sum = 0;
        int min = Integer.MAX_VALUE;
        while (right < size) {
            while (right < size && sum < target) {
                sum += nums[right];
                right++;
            }
            // if (sum >= target) {
            //     min = right - left;
            // }
            while (sum >= target) {
                min =Math.min(min, right - left);
                sum -= nums[left];
                left++;
            }
        }

        int all = 0;
        for (int ii : nums) {
            all += ii;
        }
        if (all < target) {
            return 0;
        }
        return min;
    }
}

public class HW209 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.minSubArrayLen(15, new int[]{5, 1, 3, 5, 10, 7, 4, 9, 2, 8}));
        System.out.println(solution.minSubArrayLen(11, new int[]{1, 2, 3, 4, 5}));
        System.out.println(solution.minSubArrayLen(7, new int[]{2, 3, 1, 2, 4, 3}));
        System.out.println(solution.minSubArrayLen(4, new int[]{1, 4, 4}));
        System.out.println(solution.minSubArrayLen(11, new int[]{1, 1, 1, 1, 1, 1, 1, 1}));
    }
}
