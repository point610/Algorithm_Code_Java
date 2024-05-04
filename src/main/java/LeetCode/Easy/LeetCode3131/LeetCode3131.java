package LeetCode.Easy.LeetCode3131;

import java.util.Arrays;

class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        return nums2[0] - nums1[0];
    }
}

public class LeetCode3131 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.addedInteger(new int[]{2, 6, 4}, new int[]{9, 7, 5}));
        System.out.println(solution.addedInteger(new int[]{10}, new int[]{5}));
        System.out.println(solution.addedInteger(new int[]{1, 1, 1, 1}, new int[]{1, 1, 1, 1}));
    }
}
