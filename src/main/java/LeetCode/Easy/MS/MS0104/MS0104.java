package LeetCode.Easy.MS.MS0104;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName MS0104
 * @Description TODO
 * @Author point
 * @Date 2023/10/10 19:46
 * @Version 1.0
 */
class Solution {
    public boolean canPermutePalindrome(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int size = s.length();
        for (int i = 0; i < size; i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        int one = 0;
        for (Character key : map.keySet()) {
            if (map.get(key) % 2 == 1) {
                one++;
            }
        }
        return one <= 1;

    }
}

public class MS0104 {
}
