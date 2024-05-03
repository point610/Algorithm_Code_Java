package LeetCode.Middle.LeetCode532;

import java.util.*;

class Solution {
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        Map<Integer, Integer> map = new HashMap<>();
        int res = 0;
        Set<String> set = new HashSet<>();
        for (int one : nums) {
            if (map.containsKey(one - k) && !set.contains((one - k) + "," + one)) {
                set.add(one - k + "," + one);
                res += map.get(one - k);
            }
            if (map.containsKey(one + k) && !set.contains(one + "," + (one + k))) {
                set.add(one + "," + one + k);
                res += map.get(one + k);
            }
            map.put(one, 1);
        }
        return res;
    }
}

public class LeetCode532 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.findPairs(new int[]{1, 3, 1, 5, 4}, 0));
        System.out.println(solution.findPairs(new int[]{1, 2, 4, 4, 3, 3, 0, 9, 2, 3}, 3));
        System.out.println(solution.findPairs(new int[]{1, 3, 1, 5, 4}, 0));
        System.out.println(solution.findPairs(new int[]{3, 1, 4, 1, 5}, 2));
        System.out.println(solution.findPairs(new int[]{1, 2, 3, 4, 5}, 1));
    }
}

















