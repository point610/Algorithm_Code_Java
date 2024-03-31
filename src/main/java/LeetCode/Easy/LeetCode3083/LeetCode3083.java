package LeetCode.Easy.LeetCode3083;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean isSubstringPresent(String s) {
        Set<String> set = new HashSet<>();
        for (int i = 0; i < s.length() - 1; i++) {
            set.add(s.substring(i, i + 2));
        }
        for (int i = 0; i < s.length() - 1; i++) {
            String temp = "" + s.charAt(i + 1) + s.charAt(i);
            if (set.contains(temp)) {
                return true;
            }
        }

        return false;
    }
}

public class LeetCode3083 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isSubstringPresent("leetcode"));
        System.out.println(solution.isSubstringPresent("abcba"));
        System.out.println(solution.isSubstringPresent("abcd"));
    }
}
