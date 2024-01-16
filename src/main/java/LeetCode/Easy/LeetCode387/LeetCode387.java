package LeetCode.Easy.LeetCode387;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName LeetCode387
 * @Description TODO
 * @Author point
 * @Date 2023/7/14 22:34
 * @Version 1.0
 */
class Solution {
    int[] temp = new int[26];

    public int firstUniqChar(String s) {
        int size = s.length();
        for (int i = 0; i < size; i++) {
            temp[s.charAt(i) - 'a']++;
        }
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < 26; i++) {
            if (temp[i] == 1) {
                set.add((char) ('a' + i));
            }
        }
        for (int i = 0; i < size; i++) {
            if (set.contains(s.charAt(i))) {
                return i;
            }
        }
        return -1;
    }
}

public class LeetCode387 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.firstUniqChar("leetcode"));
    }
}
