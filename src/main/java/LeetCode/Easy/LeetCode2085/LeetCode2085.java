package LeetCode.Easy.LeetCode2085;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName LeetCode2085
 * @Description TODO
 * @Author point
 * @Date 2023/9/30 11:34
 * @Version 1.0
 */
class Solution {
    public int countWords(String[] words1, String[] words2) {

        Map<String, Integer> one = new HashMap<>();
        Map<String, Integer> two = new HashMap<>();
        for (int i = 0; i < words1.length; i++) {
            one.put(words1[i], one.getOrDefault(words1[i], 0) + 1);
        }
        for (int i = 0; i < words2.length; i++) {
            two.put(words2[i], two.getOrDefault(words2[i], 0) + 1);
        }
        int sum = 0;
        for (String key : one.keySet()) {
            if (one.get(key) == 1) {
                if (two.containsKey(key) && two.get(key) == 1) {
                    sum++;
                }
            }

        }
        return sum;

    }
}

public class LeetCode2085 {
}
