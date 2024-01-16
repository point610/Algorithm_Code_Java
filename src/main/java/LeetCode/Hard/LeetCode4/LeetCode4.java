package LeetCode.Hard.LeetCode4;

/**
 * @ClassName LeetCode4
 * @Description TODO
 * @Author point
 * @Date 2023/11/26 11:52
 * @Version 1.0
 */
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int onesize = nums1.length;
        int twosize = nums2.length;
        int size = onesize + twosize;
        if (size % 2 == 1) {
            // 奇数
            // 从1开始
            int index = size / 2 + 1;
            return getKindex(nums1, nums2, index);
        } else {
            // 偶数
            // 从1开始
            int oneindex = size / 2;
            int twoindex = size / 2 + 1;
            return (getKindex(nums1, nums2, oneindex) + getKindex(nums1, nums2, twoindex)) / 2;
        }

    }

    private double getKindex(int[] nums1, int[] nums2, int index) {
        int onesize = nums1.length;
        int twosize = nums2.length;
        int oneindex = 0;
        int twoindex = 0;

        while (true) {
            // 边界
            if (oneindex == onesize) {
                return nums2[twoindex + index - 1];
            }
            if (twoindex == twosize) {
                return nums1[oneindex + index - 1];
            }
            // 找第一个
            if (index == 1) {
                return Math.min(nums1[oneindex], nums2[twoindex]);
            }
            // 正常情况
            int half = index / 2 - 1;
            // 防止越界
            int newoneindex = Math.min(onesize - 1, oneindex + half);
            int newtwoindex = Math.min(twosize - 1, twoindex + half);

            int onevalue = nums1[newoneindex];
            int twovalue = nums2[newtwoindex];
            if (onevalue <= twovalue) {
                // 需要找的要去掉几个
                index -= (newoneindex - oneindex + 1);
                // 将index移动到还没有比较的地方
                oneindex = newoneindex + 1;
            } else {
                // 需要找的要去掉几个
                index -= (newtwoindex - twoindex + 1);
                // 将index移动到还没有比较的地方
                twoindex = newtwoindex + 1;
            }
        }
    }
}

public class LeetCode4 {
}
