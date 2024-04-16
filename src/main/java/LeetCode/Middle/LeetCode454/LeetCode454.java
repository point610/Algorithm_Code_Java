package LeetCode.Middle.LeetCode454;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        Map<Integer, Integer> one = getmap(nums1, nums2);
        Map<Integer, Integer> two = getmap(nums3, nums4);
        int sum = 0;
        for (Integer oo : one.keySet()) {
            for (Integer tt : two.keySet()) {
                if (oo + tt == 0) {
                    sum += one.get(oo) * two.get(tt);
                }
            }
        }
        return sum;
    }

    private Map<Integer, Integer> getmap(int[] one, int[] two) {
        Map<Integer, Integer> res = new HashMap<>();
        for (int oo : one) {
            for (int tt : two) {
                res.put(oo + tt, res.getOrDefault(oo + tt, 0) + 1);
            }
        }

        return res;
    }
}

public class LeetCode454 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.fourSumCount(new int[]{-1, -1}, new int[]{-1, 1}, new int[]{-1, 1}, new int[]{1, -1}));
        System.out.println(solution.fourSumCount(new int[]{1, 2}, new int[]{-2, -1}, new int[]{-1, 2}, new int[]{0, 2}));
    }
}
