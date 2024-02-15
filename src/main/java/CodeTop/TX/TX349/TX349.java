package CodeTop.TX.TX349;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> one = new HashSet<>();
        for (int ii : nums1) {
            one.add(ii);
        }

        for (int ii : nums2) {
            if (one.contains(ii)) {
                set.add(ii);
            }
        }

        int[] list = new int[set.size()];
        int index = 0;
        for (Integer ii : set) {
            list[index++] = ii;
        }

        return list;
    }
}

public class TX349 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.intersection(new int[]{1, 2, 2, 1}, new int[]{2, 2})));
        System.out.println(Arrays.toString(solution.intersection(new int[]{4, 9, 5}, new int[]{9, 4, 9, 8, 4})));
    }
}
