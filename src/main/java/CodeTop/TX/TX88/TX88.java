package CodeTop.TX.TX88;

import java.util.Arrays;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0) {
            return;
        }
        if (m == 0) {
            for (int i = 0; i < n; i++) {
                nums1[i] = nums2[i];
            }
            return;
        }
        int size = nums1.length;
        m--;
        n--;
        int index = size - 1;
        while (m != -1 && n != -1) {
            if (nums1[m] < nums2[n]) {
                nums1[index--] = nums2[n--];
            } else {
                nums1[index--] = nums1[m--];
            }
        }
        while (m != -1) {
            nums1[index--] = nums1[m--];
        }
        while (n != -1) {
            nums1[index--] = nums2[n--];
        }

    }
}

public class TX88 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution);
    }
}
