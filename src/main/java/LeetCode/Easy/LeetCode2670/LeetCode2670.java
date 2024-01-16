package LeetCode.Easy.LeetCode2670;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName LeetCode2670
 * @Description TODO
 * @Author point
 * @Date 2023/10/3 12:55
 * @Version 1.0
 */
class Solution {
    int getdiff(int[] nums, int left, int right) {
        Set<Integer> set = new HashSet<>();
        for (int i = left; i <= right; i++) {
            set.add(nums[i]);
        }
        return set.size();
    }

    public int[] distinctDifferenceArray(int[] nums) {
        int size = nums.length;
        int[] diff = new int[size];
        for (int i = 0; i < size; i++) {
            if (i == size - 1) {
                diff[i] = getdiff(nums, 0, i) - 0;
            } else {
                diff[i] = getdiff(nums, 0, i) - getdiff(nums, i + 1, size - 1);
            }
        }
        return diff;
    }
}

public class LeetCode2670 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.distinctDifferenceArray(new int[]{1, 2, 3, 4, 5});
    }
}
