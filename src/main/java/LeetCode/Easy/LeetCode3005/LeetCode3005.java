package LeetCode.Easy.LeetCode3005;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int iii : nums) {
            map.put(iii, map.getOrDefault(iii, 0) + 1);
        }
        int max = 0;
        for (int key : map.keySet()) {
            max = Math.max(max, map.get(key));
        }
        int sum = 0;
        for (int key : map.keySet()) {
            if (map.get(key) == max) {
                sum += max;
            }
        }
        return sum;
    }
}

public class LeetCode3005 {
}
