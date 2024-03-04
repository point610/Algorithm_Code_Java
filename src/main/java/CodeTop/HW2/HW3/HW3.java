package CodeTop.HW2.HW3;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int size = s.length();
        Map<Character, Integer> map = new HashMap<>();
        int left = 0;
        int res = 0;
        for (int i = 0; i < size; i++) {
            char cc = s.charAt(i);
            if (map.containsKey(cc)) {
                left = Math.max(left, map.get(cc) + 1);
            }
            map.put(cc, i);
            res = Math.max(res, i - left + 1);
        }
        return res;
    }
}

public class HW3 {
}
