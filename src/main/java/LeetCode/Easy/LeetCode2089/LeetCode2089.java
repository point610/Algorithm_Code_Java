package LeetCode.Easy.LeetCode2089;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @ClassName LeetCode2089
 * @Description TODO
 * @Author point
 * @Date 2023/9/30 12:41
 * @Version 1.0
 */
class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int size = nums.length;
        Arrays.sort(nums);

        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            if (nums[i] == target) {
                list.add(i);
            }

        }
        return list;
    }
}

public class LeetCode2089 {
}
