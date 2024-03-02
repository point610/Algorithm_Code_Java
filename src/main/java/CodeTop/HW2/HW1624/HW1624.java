package CodeTop.HW2.HW1624;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int max = -1;
        for (int i = 0; i < s.length(); i++) {
            char cc = s.charAt(i);
            if (!map.containsKey(cc)) {
                map.put(cc, i);
            } else {
                max = Math.max(max, i - map.get(cc) - 1);
            }
        }
        return max;
    }
}

public class HW1624 {
    public static void main(String[] args) {
    }}
