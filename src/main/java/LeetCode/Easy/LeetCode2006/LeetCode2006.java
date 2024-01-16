package LeetCode.Easy.LeetCode2006;

import java.util.Arrays;

/**
 * @ClassName LeetCode2006
 * @Description TODO
 * @Author point
 * @Date 2023/9/30 1:10
 * @Version 1.0
 */
class Solution {
    public int countKDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int sum = 0;
        int size = nums.length;
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                int step = nums[j] - nums[i];
                if (step > k) {
                    break;
                }
                if (step == k) {
                    sum++;
                }
            }
        }
        return sum;

    }
}

public class LeetCode2006 {
}
