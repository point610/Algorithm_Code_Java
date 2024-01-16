package LeetCode.Middle.LeetCode209;

/**
 * @ClassName LeetCode209
 * @Description TODO
 * @Author point
 * @Date 2023/8/4 0:31
 * @Version 1.0
 */
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int size = nums.length;
        int sum = 0;
        int left = 0;
        int minIndex = 0;
        int min = 1000000;
        for (int i = 0; i < size; i++) {
            sum += nums[i];
            minIndex++;

            if (sum >= target) {
                while (sum - nums[left] >= target) {
                    sum -= nums[left];
                    left++;
                    minIndex--;
                }
                min = Math.min(min, minIndex);
            }

        }

        return min == 1000000 ? 0 : min;
    }
}

public class LeetCode209 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.minSubArrayLen(11, new int[]{1, 1, 1, 1, 1, 1, 1, 1}));
    }
}
