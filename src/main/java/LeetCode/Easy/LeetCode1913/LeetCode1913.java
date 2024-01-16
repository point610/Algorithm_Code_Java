package LeetCode.Easy.LeetCode1913;

import java.util.Arrays;

/**
 * @ClassName LeetCode1913
 * @Description TODO
 * @Author point
 * @Date 2023/9/29 12:13
 * @Version 1.0
 */
class Solution {
    int getnumber(int a, int b, int c, int d) {
        return c * d - a * b;
    }

    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        return getnumber(nums[0], nums[1], nums[nums.length - 1], nums[nums.length - 2]);

    }
}

public class LeetCode1913 {
}
