package LeetCode.Easy.LeetCode2605;

import java.util.Arrays;

/**
 * @ClassName LeetCode2605
 * @Description TODO
 * @Author point
 * @Date 2023/10/3 12:07
 * @Version 1.0
 */
class Solution {
    public int minNumber(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int oneindex = 0;
        int twoindex = 0;
        while (oneindex < nums1.length && twoindex < nums2.length) {
            if (nums1[oneindex] == nums2[twoindex]) {
                return nums1[oneindex];
            }
            if (nums1[oneindex] < nums2[twoindex]) {
                oneindex++;
            } else {
                twoindex++;
            }
        }
        return Math.min(nums1[0] * 10 + nums2[0], nums2[0] * 10 + nums1[0]);
    }
}

public class LeetCode2605 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.minNumber(new int[]{3,5,2,6}, new int[]{3,1,7}));
    }
}
