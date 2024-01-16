package CodeTop.HW.HW1624;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName HW1624
 * @Description TODO
 * @Author point
 * @Date 2023/12/23 22:08
 * @Version 1.0
 */
class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {

        int max = -1;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char cc = s.charAt(i);
            if (map.containsKey(cc)) {
                max = Math.max(max, i - map.get(cc) - 1);
            } else {
                map.put(cc, i);
            }
        }
        return max;
    }
}

public class HW1624 {
}
