package LeetCode.Easy.LeetCode2465;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName LeetCode2465
 * @Description TODO
 * @Author point
 * @Date 2023/10/2 12:11
 * @Version 1.0
 */
class Solution {
    public int distinctAverages(int[] nums) {
        int size = nums.length;
        Arrays.sort(nums);
        Set<Double> set = new HashSet<>();
        for (int i = 0, j = size - 1; i < size / 2; i++, j--) {
            set.add((nums[i] + nums[j]) / 2.0);
        }
        return set.size();
    }
}

public class LeetCode2465 {
}
