package LeetCode.Easy.LeetCode1961;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName LeetCode1961
 * @Description TODO
 * @Author point
 * @Date 2023/9/29 19:33
 * @Version 1.0
 */
class Solution {
    public boolean isPrefixString(String s, String[] words) {
        StringBuilder stringBuilder = new StringBuilder();
        int size = words.length;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < size; i++) {
            stringBuilder.append(words[i]);
            set.add(stringBuilder.length());
        }
        if (set.contains(s.length())) {
            return stringBuilder.indexOf(s) == 0;
        }
        return false;
    }
}

public class LeetCode1961 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isPrefixString("a", new String[]{"aa", "aaaa", "banana"}));
    }
}
