package CodeTop.TX.TXLCR169;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public char dismantlingAction(String arr) {
        Map<Character, Integer> map = new HashMap<>();
        char[] temp = arr.toCharArray();
        for (char cc : temp) {
            map.put(cc, map.getOrDefault(cc, 0) + 1);
        }

        for (char cc : temp) {
            if (map.get(cc) == 1) {
                return cc;
            }
        }
        return ' ';
    }
}

public class TXLCR169 {
}
