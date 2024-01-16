package LeetCode.Middle.LeetCode164;

import java.util.Arrays;

/**
 * @ClassName LeetCode164
 * @Description TODO
 * @Author point
 * @Date 2023/11/12 22:32
 * @Version 1.0
 */
class Solution {
    public int maximumGap(int[] nums) {
        if (nums.length < 2) {
            return 0;
        }
        Arrays.sort(nums);
        int size = nums.length;
        int min = 0;
        for (int i = 0; i < size - 1; i++) {
            min = Math.max(min, nums[i + 1] - nums[i]);
        }
        return min;
    }
}

public class LeetCode164 {
}
