package LeetCode.Easy.LeetCode2325;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName LeetCode2325
 * @Description TODO
 * @Author point
 * @Date 2023/10/1 13:14
 * @Version 1.0
 */
class Solution {
    public String decodeMessage(String key, String message) {
        Map<Character, Character> map = new HashMap<>();
        int size = key.length();
        char index = 'a';
        for (int i = 0; i < size; i++) {
            if (key.charAt(i) == ' ') {
                continue;
            }
            if (!map.containsKey(key.charAt(i))) {
                map.put(key.charAt(i), index);
                index++;
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        size = message.length();
        for (int i = 0; i < size; i++) {
            if (message.charAt(i) == ' ') {
                stringBuilder.append(' ');
                continue;
            }
            stringBuilder.append(map.get(message.charAt(i)));
        }
        return stringBuilder.toString();

    }
}

public class LeetCode2325 {
    public static void main(String[] args) {
        Solution
                solution = new Solution();
        System.out.println(solution.decodeMessage("the quick brown fox jumps over the lazy dog", "vkbs bs t suepuv"));
    }
}
