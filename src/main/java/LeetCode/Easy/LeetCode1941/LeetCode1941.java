package LeetCode.Easy.LeetCode1941;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName LeetCode1941
 * @Description TODO
 * @Author point
 * @Date 2023/9/29 16:59
 * @Version 1.0
 */
class Solution {
    public boolean areOccurrencesEqual(String s) {

        Map<Character, Integer> map = new HashMap<>();
        int size = s.length();
        for (int i = 0; i < size; i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        int one = map.get(s.charAt(0));
        for (Character key : map.keySet()) {
            if (one != map.get(key)) {
                return false;
            }

        }

        return true;
    }
}

public class LeetCode1941 {
}
