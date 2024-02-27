package LeetCode.Easy.LeetCode3046;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int iii : nums) {
            map.put(iii, map.getOrDefault(iii, 0) + 1);
            if (map.get(iii) >= 3) {
                return false;
            }
        }
        return true;
    }
}

public class LeetCode3046 {
}
