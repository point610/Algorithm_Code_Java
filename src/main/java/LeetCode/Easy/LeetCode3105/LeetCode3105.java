package LeetCode.Easy.LeetCode3105;

import java.util.Arrays;

class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int size = nums.length;
        int[] upper = new int[size];
        int[] downer = new int[size];
        Arrays.fill(upper, 1);
        Arrays.fill(downer, 1);
        int max = 1;
        for (int i = 1; i < size; i++) {
            int current = nums[i];
            if (current > nums[i - 1]) {
                upper[i] = Math.max(upper[i], upper[i - 1] + 1);
            }
            if (current < nums[i - 1]) {
                downer[i] = Math.max(downer[i], downer[i - 1] + 1);
            }
            max = Math.max(max, upper[i]);
            max = Math.max(max, downer[i]);
        }
        return max;
    }
}

public class LeetCode3105 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.longestMonotonicSubarray(new int[]{1, 4, 3, 3, 2}));
        System.out.println(solution.longestMonotonicSubarray(new int[]{3, 3, 3, 3}));
    }
}
