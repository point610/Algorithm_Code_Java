package CodeTop.TX.TX350;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> list = new ArrayList<>();

        int oneindex = 0;
        int twoindex = 0;
        while (oneindex < nums1.length && twoindex < nums2.length) {
            if (nums1[oneindex] == nums2[twoindex]) {
                list.add(nums1[oneindex]);
                oneindex++;
                twoindex++;
            } else if (nums1[oneindex] < nums2[twoindex]) {
                oneindex++;
            } else {
                twoindex++;
            }
        }
        return list.stream().mapToInt(Integer::valueOf).toArray();
    }
}

public class TX350 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.intersect(new int[]{1, 2, 2, 1}, new int[]{2, 2})));
        System.out.println(Arrays.toString(solution.intersect(new int[]{4, 9, 5}, new int[]{9, 4, 9, 8, 4})));
    }
}
