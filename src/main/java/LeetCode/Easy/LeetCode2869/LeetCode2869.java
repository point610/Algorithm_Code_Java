package LeetCode.Easy.LeetCode2869;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @ClassName LeetCode2869
 * @Description TODO
 * @Author point
 * @Date 2023/10/4 14:19
 * @Version 1.0
 */
class Solution {
    public int minOperations(List<Integer> nums, int k) {
        int size = nums.size();
        Set<Integer> set = new HashSet<>();
        int cz = 0;
        for (int i = size - 1; i >= 0; i--) {
            if (nums.get(i) <= k) {
                set.add(nums.get(i));
                if (set.size() == k) {
                    return cz + 1;
                }
            }
            cz++;

        }
        return size;
    }
}

public class LeetCode2869 {
}
