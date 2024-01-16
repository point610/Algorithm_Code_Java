package LeetCode.Middle.LeetCode152;

/**
 * @ClassName LeetCode152
 * @Description TODO
 * @Author point
 * @Date 2023/9/1 23:48
 * @Version 1.0
 */
class Solution {
    public int maxProduct(int[] nums) {

        int size = nums.length;
        int[] max = new int[size];
        int[] min = new int[size];
        for (int i = 0; i < size; i++) {
            max[i] = nums[i];
            min[i] = nums[i];
        }

        for (int i = 1; i < size; i++) {
            max[i] = Math.max(max[i - 1] * nums[i], Math.max(nums[i], min[i - 1] * nums[i]));
            min[i] = Math.min(min[i - 1] * nums[i], Math.min(nums[i], max[i - 1] * nums[i]));
        }
        int res = Integer.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            res = Math.max(res, max[i]);
        }
        return res;

    }
}

public class LeetCode152 {
}
