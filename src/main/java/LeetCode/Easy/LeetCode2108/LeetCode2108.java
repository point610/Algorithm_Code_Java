package LeetCode.Easy.LeetCode2108;

/**
 * @ClassName LeetCode2108
 * @Description TODO
 * @Author point
 * @Date 2023/9/30 11:49
 * @Version 1.0
 */
class Solution {
    boolean ishuiwen(String s) {
        int size = s.length();
        for (int i = 0; i < size / 2; i++) {
            if (s.charAt(i) != s.charAt(size - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public String firstPalindrome(String[] words) {
        int sum = 0;
        int size = words.length;
        for (int i = 0; i < size; i++) {
            if (ishuiwen(words[i])) {
                return words[i];
            }
        }
        return "";
    }
}

public class LeetCode2108 {
}
