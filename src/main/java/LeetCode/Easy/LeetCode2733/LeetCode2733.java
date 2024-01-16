package LeetCode.Easy.LeetCode2733;

import java.util.Arrays;

/**
 * @ClassName LeetCode2733
 * @Description TODO
 * @Author point
 * @Date 2023/10/4 12:54
 * @Version 1.0
 */
class Solution {
    public int findNonMinOrMax(int[] nums) {
        int size = nums.length;
        if (size <= 2) {
            return -1;
        }
        Arrays.sort(nums);
        return nums[1];
    }
}

public class LeetCode2733 {
}
