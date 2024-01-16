package LeetCode.Easy.LeetCode976;

import java.util.Arrays;

/**
 * @ClassName LeetCode976
 * @Description TODO
 * @Author point
 * @Date 2023/8/14 23:15
 * @Version 1.0
 */
class Solution {
    public int largestPerimeter(int[] nums) {

        int size = nums.length;
        Arrays.sort(nums);

        for (int i = size - 1; i >= 2; i--) {
            if (is(nums[i - 2], nums[i - 1], nums[i])) {
                return nums[i - 2] + nums[i - 1] + nums[i];
            }
        }
        return 0;

    }

    boolean is(int a, int b, int c) {
        if (c >= (b + a)) {
            return false;
        }
        return true;
    }
}

public class LeetCode976 {
}
