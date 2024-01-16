package LeetCode.Easy.LeetCode1984;

import java.util.Arrays;

/**
 * @ClassName LeetCode1984
 * @Description TODO
 * @Author point
 * @Date 2023/9/30 0:46
 * @Version 1.0
 */
class Solution {
    public int minimumDifference(int[] nums, int k) {
        if (k == 1) {
            return 0;
        }

        Arrays.sort(nums);
        int min = Integer.MAX_VALUE;
        k--;
        int size = nums.length;
        for (int i = 0; i < size - k; i++) {
            min = Math.min(min, nums[k + i] - nums[i]);
        }
        return min;

    }
}

public class LeetCode1984 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.minimumDifference(new int[]{9, 4, 1, 7}, 2));
    }
}
