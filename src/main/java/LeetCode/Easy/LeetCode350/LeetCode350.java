package LeetCode.Easy.LeetCode350;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @ClassName LeetCode350
 * @Description TODO
 * @Author point
 * @Date 2023/7/14 0:10
 * @Version 1.0
 */
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> integers = new ArrayList<>();
        int one = 0;
        int two = 0;
        int oneSize = nums1.length;
        int twoSize = nums2.length;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        while (one < oneSize && two < twoSize) {
            while (one < oneSize && two < twoSize && nums1[one] < nums2[two]) {
                one++;
            }
            while (one < oneSize && two < twoSize && nums1[one] > nums2[two]) {
                two++;
            }
            if (one < oneSize && two < twoSize && nums1[one] == nums2[two]) {
                integers.add(nums1[one]);
                one++;
                two++;
            }

        }
        return integers.stream().mapToInt(Integer::intValue).toArray();
    }
}

public class LeetCode350 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] intersect = solution.intersect(new int[]{7, 2, 2, 4, 7, 0, 3, 4, 5}, new int[]{3, 9, 8, 6, 1, 9});
        for (int i = 0; i < intersect.length; i++) {
            System.out.println(intersect[i]);
        }
    }
}
