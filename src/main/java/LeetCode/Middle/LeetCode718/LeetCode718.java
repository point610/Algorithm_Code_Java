package LeetCode.Middle.LeetCode718;

/**
 * @ClassName LeetCode718
 * @Description TODO
 * @Author point
 * @Date 2023/8/5 0:48
 * @Version 1.0
 */
class Solution {
    int findMax(int[] a, int[] b, int sa, int sb, int maxLen) {
        int res = 0;
        int temp = 0;
        for (int i = 0; i < maxLen; i++) {
            if (a[sa + i] == b[sb + i]) {
                temp++;
            } else {
                temp = 0;
            }
            res = Math.max(res, temp);
        }
        return res;
    }

    public int findLength(int[] nums1, int[] nums2) {
        int oneSize = nums1.length;
        int twoSize = nums2.length;
        int res = 0;
        // one从右入
        for (int i = 0; i < twoSize; i++) {
            int length = Math.min(oneSize, twoSize - i);
            res = Math.max(res, findMax(nums1, nums2, 0, i, length));
        }

        // two从右入
        for (int i = 0; i < oneSize; i++) {
            int length = Math.min(oneSize - i, twoSize);
            res = Math.max(res, findMax(nums1, nums2, i, 0, length));
        }

        return res;
    }
}

public class LeetCode718 {
}
