package LeetCode.Easy.LeetCode1897;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName LeetCode1897
 * @Description TODO
 * @Author point
 * @Date 2023/9/29 11:25
 * @Version 1.0
 */
class Solution {
    public boolean makeEqual(String[] words) {

        Map<Character, Integer> map = new HashMap<>();
        int size = words.length;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                map.put(words[i].charAt(j), map.getOrDefault(words[i].charAt(j), 0) + 1);
            }
        }
        for (Character key : map.keySet()) {

            if (map.get(key) % size != 0) {
                return false;
            }

        }
        return true;

    }
}

public class LeetCode1897 {
}
