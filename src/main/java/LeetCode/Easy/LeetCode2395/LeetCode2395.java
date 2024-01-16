package LeetCode.Easy.LeetCode2395;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName LeetCode2395
 * @Description TODO
 * @Author point
 * @Date 2023/10/1 15:59
 * @Version 1.0
 */
class Solution {
    public boolean findSubarrays(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int size = nums.length;
        for (int i = 0; i < size - 1; i++) {
            if (set.contains(nums[i] + nums[i + 1])) {
                return true;
            }
            set.add(nums[i] + nums[i + 1]);
        }
        return false;
    }
}

public class LeetCode2395 {
}
