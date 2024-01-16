package LeetCode.Easy.LCR169;


import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName LCR169
 * @Description TODO
 * @Author point
 * @Date 2023/10/9 18:51
 * @Version 1.0
 */

class Solution {

    public char dismantlingAction(String arr) {

        int[] list = new int[26];
        int size = arr.length();
        for (int i = 0; i < size; i++) {
            list[arr.charAt(i) - 'a']++;
        }
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < 26; i++) {
            if (list[i] == 1) {
                set.add((char) ('a' + i));
            }
        }
        if (set.size() == 0) {
            return ' ';
        }
        for (int i = 0; i < size; i++) {
            if (set.contains(arr.charAt(i))) {
                return arr.charAt(i);
            }
        }
        return ' ';
    }
}

public class LCR169 {
}
