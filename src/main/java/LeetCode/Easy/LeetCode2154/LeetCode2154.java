package LeetCode.Easy.LeetCode2154;

import java.util.LinkedList;
import java.util.List;

/**
 * @ClassName LeetCode2154
 * @Description TODO
 * @Author point
 * @Date 2023/9/30 19:36
 * @Version 1.0
 */
class Solution {
    public int findFinalValue(int[] nums, int original) {
        int size = nums.length;
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            list.add(nums[i]);
        }
        while (list.contains(original)) {
            original *= 2;
        }
        return original;
    }
}

public class LeetCode2154 {
}
