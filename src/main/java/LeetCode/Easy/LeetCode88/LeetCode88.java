package LeetCode.Easy.LeetCode88;

/**
 * @ClassName LeetCode88
 * @Description TODO
 * @Author point
 * @Date 2023/8/13 21:25
 * @Version 1.0
 */
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0) {
            return;
        }
        if (m == 0) {
            for (int i = 0; i < n; i++) {
                nums1[i] = nums2[i];
            }
        }

        int[] one = new int[m];
        for (int i = 0; i < m; i++) {
            one[i] = nums1[i];
        }
        int oneIndex = 0;
        int twoIndex = 0;

        int point = 0;
        while (oneIndex < m && twoIndex < n) {
            if (one[oneIndex] <= nums2[twoIndex]) {
                nums1[point] = one[oneIndex];
                oneIndex++;
            } else {
                nums1[point] = nums2[twoIndex];
                twoIndex++;
            }
            point++;
        }
        while (oneIndex < m) {
            nums1[point] = one[oneIndex];
            oneIndex++;
            point++;
        }
        while (twoIndex < n) {
            nums1[point] = nums2[twoIndex];
            twoIndex++;
            point++;
        }
    }
}

public class LeetCode88 {
}
