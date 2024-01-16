package LeetCode.Easy.LeetCode345;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName LeetCode345
 * @Description TODO
 * @Author point
 * @Date 2023/7/13 23:29
 * @Version 1.0
 */
class Solution {
    public String reverseVowels(String s) {
        if (s.isEmpty() || " ".equals(s) || s.length() == 1) {
            return s;
        }
        StringBuilder stringBuilder = new StringBuilder(s);
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

        int left = 0;
        int right = s.length() - 1;
        while (left <= right) {
            while (left <= right && !set.contains(stringBuilder.charAt(left))) {
                left++;
            }
            while (left <= right && !set.contains(stringBuilder.charAt(right)) && left <= right) {
                right--;
            }
            if (!(left <= right)) {
                break;
            }
            char temp = stringBuilder.charAt(left);
            stringBuilder.setCharAt(left, stringBuilder.charAt(right));
            stringBuilder.setCharAt(right, temp);

            left++;
            right--;
        }
        return String.valueOf(stringBuilder);
    }
}

public class LeetCode345 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.reverseVowels("hello"));

    }
}
