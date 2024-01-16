package LeetCode.Easy.LeetCode1704;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName LeetCode1704
 * @Description TODO
 * @Author point
 * @Date 2023/9/28 16:09
 * @Version 1.0
 */
class Solution {

    public boolean halvesAreAlike(String s) {
        Set<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');

        int size = s.length();
        int left = 0;
        int right = 0;
        for (int i = 0; i < size / 2; i++) {
            if (set.contains(s.charAt(i))) {
                left++;
            }
        }
        for (int i = size / 2; i < size; i++) {
            if (set.contains(s.charAt(i))) {
                right++;
            }
        }


        return left == right;
    }
}

public class LeetCode1704 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.halvesAreAlike("AbCdEfGh");
    }
}
