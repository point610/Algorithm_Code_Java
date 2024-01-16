package LeetCode.Easy.LeetCode1624;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName LeetCode1624
 * @Description TODO
 * @Author point
 * @Date 2023/9/28 12:33
 * @Version 1.0
 */
class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        Map<Character, Integer> mapindex = new HashMap<>();
        int size = s.length();
        int max = 0;
        for (int i = 0; i < size; i++) {
            char temp = s.charAt(i);
            if (mapindex.containsKey(temp)) {
                int gap = i - mapindex.get(temp);
                max = Math.max(max, gap);
                // mapindex.put(temp, i);

            } else {
                mapindex.put(temp, i);
            }

        }
        return max - 1;

    }
}

public class LeetCode1624 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.maxLengthBetweenEqualCharacters("mgntdygtxrvxjnwksqhxuxtrv"));
    }
}
