package LeetCode.Easy.LeetCode2016;

/**
 * @ClassName LeetCode2016
 * @Description TODO
 * @Author point
 * @Date 2023/9/30 1:16
 * @Version 1.0
 */
class Solution {
    public int maximumDifference(int[] nums) {
        int size = nums.length;
        int res = -1;
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (nums[i] != nums[j]) {
                    res = Math.max(res, nums[j] - nums[i]);
                }

            }
        }
        return res;
    }
}

public class LeetCode2016 {
}
