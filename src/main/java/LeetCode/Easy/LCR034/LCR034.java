package LeetCode.Easy.LCR034;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName LCR034
 * @Description TODO
 * @Author point
 * @Date 2023/10/7 21:56
 * @Version 1.0
 */
class Solution {
    public boolean isAlienSorted(String[] words, String order) {

        Map<Character, Integer> map = new HashMap<>();
        int size = order.length();
        for (int i = 0; i < size; i++) {
            map.put(order.charAt(i), i);
        }
        String[] www = words.clone();
        Arrays.sort(www, (one, two) -> {
            int onesize = one.length();
            int twosize = two.length();
            int tempsize = Math.min(onesize, twosize);
            for (int i = 0; i < tempsize; i++) {
                if (one.charAt(i) != two.charAt(i)) {
                    return Integer.compare(map.get(one.charAt(i)), map.get(two.charAt(i)));
                }
            }
            return Integer.compare(onesize, twosize);
        });

        size = words.length;
        for (int i = 0; i < size; i++) {
            if (www[i] != words[i]) {
                return false;
            }
        }
        return true;
    }
}

public class LCR034 {
}
