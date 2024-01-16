package LeetCode.Middle.LeetCode438;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName LeetCode438
 * @Description TODO
 * @Author point
 * @Date 2023/11/25 16:32
 * @Version 1.0
 */
class Solution {
    private boolean same(String one, String two) {
        int[] list = new int[26];
        int size = one.length();
        for (int i = 0; i < size; i++) {
            list[one.charAt(i) - 'a']++;
        }
        for (int i = 0; i < size; i++) {
            list[two.charAt(i) - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (list[i] != 0) {
                return false;
            }
        }
        return true;

    }

    public List<Integer> findAnagrams(String s, String p) {
        int ssize = s.length();
        int psize = p.length();
        if (ssize < psize) {
            return new ArrayList<>();
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <= ssize - psize; i++) {
            if (same(s.substring(i, i + psize), p)) {
                list.add(i);
            }
        }

        return list;
    }
}

public class LeetCode438 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.findAnagrams("cbaebabacd", "abc");
    }
}
