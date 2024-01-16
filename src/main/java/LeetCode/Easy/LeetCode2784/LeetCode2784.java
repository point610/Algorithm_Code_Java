package LeetCode.Easy.LeetCode2784;

import java.util.Arrays;

/**
 * @ClassName LeetCode2784
 * @Description TODO
 * @Author point
 * @Date 2023/10/4 13:53
 * @Version 1.0
 */
class Solution {
    public boolean isGood(int[] nums) {
        Arrays.sort(nums);
        int size = nums.length;
        if (size == 1) {
            return false;
        }
        for (int i = 0; i < size - 1; i++) {
            if (nums[i] != i + 1) {
                return false;
            }
        }
        return nums[size - 1] == nums[size - 2];
    }
}

public class LeetCode2784 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isGood(new int[]{3, 4, 4, 1, 2, 1}));
    }
}
