package LeetCode.Easy.LeetCode2540;

/**
 * @ClassName LeetCode2540
 * @Description TODO
 * @Author point
 * @Date 2023/10/3 11:17
 * @Version 1.0
 */
class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
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
        return -1;
    }
}

public class LeetCode2540 {
}
