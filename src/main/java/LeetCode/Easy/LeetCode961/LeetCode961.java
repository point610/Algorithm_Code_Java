package LeetCode.Easy.LeetCode961;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName LeetCode961
 * @Description TODO
 * @Author point
 * @Date 2023/8/14 23:03
 * @Version 1.0
 */
class Solution {
    public int repeatedNTimes(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int size = nums.length;
        for (int i = 0; i < size; i++) {
            if (set.contains(nums[i])) {
                return nums[i];
            }
            set.add(nums[i]);
        }
        return 0;
    }
}

public class LeetCode961 {
}
