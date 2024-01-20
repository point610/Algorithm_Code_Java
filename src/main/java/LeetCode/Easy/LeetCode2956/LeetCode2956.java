package LeetCode.Easy.LeetCode2956;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {

        Set<Integer> one = new HashSet<>();
        Set<Integer> two = new HashSet<>();
        for (int ii : nums1) {
            one.add(ii);
        }
        int ooo = 0;
        int ttt = 0;
        for (int ii : nums2) {
            two.add(ii);
            if (one.contains(ii)) {
                ttt++;
            }
        }
        for (int ii : nums1) {
            if (two.contains(ii)) {
                ooo++;
            }
        }
        return new int[]{ooo, ttt};
    }
}

public class LeetCode2956 {
}
