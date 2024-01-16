package LeetCode.Middle.LeetCode128;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName LeetCode128
 * @Description TODO
 * @Author point
 * @Date 2023/8/10 11:52
 * @Version 1.0
 */
class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> hashSet = new HashSet<>();
        int size = nums.length;
        for (int i = 0; i < size; i++) {
            hashSet.add(nums[i]);
        }

        // 开始判断，向上寻找
        int max = 0;
        for (Integer integer : hashSet) {
            // 向上寻找
            if (!hashSet.contains(integer - 1)) {
                int current = integer;
                int currentLen = 1;

                while (hashSet.contains(current+1)) {
                    currentLen++;
                    current++;
                }
                max = Math.max(max, currentLen);
            }
        }
        return max;
    }
}

public class LeetCode128 {
}
