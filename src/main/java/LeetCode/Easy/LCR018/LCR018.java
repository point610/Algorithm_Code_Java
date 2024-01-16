package LeetCode.Easy.LCR018;

/**
 * @ClassName LCR018
 * @Description TODO
 * @Author point
 * @Date 2023/10/7 21:20
 * @Version 1.0
 */
class Solution {
    boolean is(char c) {
        return '0' <= c && c <= '9' || 'a' <= c && c <= 'z' || 'A' <= c && c <= 'Z';
    }

    boolean same(char a, char b) {
        if (a == b) {
            return true;
        }
        if ('A' <= a && a <= 'Z') {
            a += 32;
        }
        if ('A' <= b && b <= 'Z') {
            b += 32;
        }
        return a == b;
    }

    public boolean isPalindrome(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        int size = s.length();
        for (int i = 0; i < size; i++) {
            if (is(s.charAt(i))) {
                stringBuilder.append(s.charAt(i));
            }
        }
        size = stringBuilder.length();
        for (int i = 0; i < size / 2; i++) {
            if (!same(stringBuilder.charAt(i), stringBuilder.charAt(size - 1 - i))) {
                return false;
            }
        }
        return true;
    }
}

public class LCR018 {
}
