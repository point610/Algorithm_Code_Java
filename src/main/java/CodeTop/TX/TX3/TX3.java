package CodeTop.TX.TX3;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int res = 0;
        int left = 0;
        int size = s.length();
        for (int i = 0; i < size; i++) {
            char cc = s.charAt(i);
            if (map.containsKey(cc)) {
                // 防止left左移
                left = Math.max(left, map.get(cc) + 1);
            }
            // 滑动窗口时计算最大值
            map.put(cc, i);
            res = Math.max(res, i - left + 1);
        }
        return res;
    }
}

public class TX3 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.lengthOfLongestSubstring("abcabcbb"));
        System.out.println(solution.lengthOfLongestSubstring("bbbbb"));
        System.out.println(solution.lengthOfLongestSubstring("pwwkew"));
    }
}
