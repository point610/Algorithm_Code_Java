package LeetCode.Easy.LeetCode2441;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName LeetCode2441
 * @Description TODO
 * @Author point
 * @Date 2023/10/2 10:51
 * @Version 1.0
 */
class Solution {
    public int findMaxK(int[] nums) {
        int size = nums.length;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < size; i++) {
            set.add(nums[i]);
        }
        int max = -1;

        for (int i = 0; i < size; i++) {
            if (nums[i] < 0) {
                if (set.contains(-nums[i])) {
                    max = Math.max(max, -nums[i]);
                }
            }
        }
        return max;
    }
}

public class LeetCode2441 {
}
