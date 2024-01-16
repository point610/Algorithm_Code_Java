package LeetCode.Middle.LeetCode3;

import java.util.HashMap;

/**
 * @ClassName LeetCode3
 * @Description TODO
 * @Author point
 * @Date 2023/8/4 0:14
 * @Version 1.0
 */
class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        int max = 0;
        int left = 0;
        int size = s.length();
        for (int i = 0; i < size; i++) {
            // 修改滑动窗口的最左的指针
            if (hashMap.containsKey(s.charAt(i))) {
                left = Math.max(left, hashMap.get(s.charAt(i)) + 1);
            }

            // 设置数值表中的元素为最右边的下标
            hashMap.put(s.charAt(i), i);
            max = Math.max(max, i - left + 1);
        }
        return max;
    }
}

public class LeetCode3 {
}
