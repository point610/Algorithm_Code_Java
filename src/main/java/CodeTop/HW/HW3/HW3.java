package CodeTop.HW.HW3;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName HW3
 * @Description TODO
 * @Author point
 * @Date 2023/12/25 15:23
 * @Version 1.0
 */
class Solution {
    public int lengthOfLongestSubstring(String s) {

        int max = 0;
        int left = 0;
        Map<Character, Integer> map = new HashMap<>();
        int size = s.length();
        if (size == 0) {
            return 0;
        }
        for (int i = 0; i < size; i++) {
            if (map.containsKey(s.charAt(i))) {
                left = Math.max(left, map.get(s.charAt(i)) + 1);
            }
            map.put(s.charAt(i), i);
            max = Math.max(max, i - left + 1);
        }
        return max;
    }
}

public class HW3 {
    public static void main(String[] args) {

        Solution solution = new Solution();
        System.out.println(solution.lengthOfLongestSubstring(" "));
    }
}
