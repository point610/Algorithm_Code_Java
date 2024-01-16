package LeetCode.Easy.LeetCode1480;

/**
 * @ClassName LeetCode1480
 * @Description TODO
 * @Author point
 * @Date 2023/9/27 16:05
 * @Version 1.0
 */
class Solution {
    public int[] runningSum(int[] nums) {
        int size = nums.length;
        for (int i = 1; i < size; i++) {
            nums[i] += nums[i - 1];
        }
        return nums;

    }
}

public class LeetCode1480 {
}
