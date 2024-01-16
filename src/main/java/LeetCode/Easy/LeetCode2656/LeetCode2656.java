package LeetCode.Easy.LeetCode2656;

import java.util.Arrays;

/**
 * @ClassName LeetCode2656
 * @Description TODO
 * @Author point
 * @Date 2023/10/3 12:44
 * @Version 1.0
 */
class Solution {
    public int maximizeSum(int[] nums, int k) {
        Arrays.sort(nums);

        return (nums[nums.length - 1] + nums[nums.length - 1] + k - 1) * k / 2;
    }
}

public class LeetCode2656 {
}
