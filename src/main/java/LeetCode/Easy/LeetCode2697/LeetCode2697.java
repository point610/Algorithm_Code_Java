package LeetCode.Easy.LeetCode2697;

/**
 * @ClassName LeetCode2697
 * @Description TODO
 * @Author point
 * @Date 2023/10/1 17:46
 * @Version 1.0
 */
class Solution {
    public String makeSmallestPalindrome(String s) {
        StringBuilder stringBuilder = new StringBuilder(s);
        int size = s.length();
        for (int i = 0; i < size / 2; i++) {
            if (stringBuilder.charAt(i) != stringBuilder.charAt(size - i - 1)) {
                char temp = (char) Math.min(stringBuilder.charAt(i), stringBuilder.charAt(size - i - 1));
                stringBuilder.replace(i, i + 1, String.valueOf(temp));
                stringBuilder.replace(size - i - 1, size - i, String.valueOf(temp));
            }
        }
        return stringBuilder.toString();
    }
}

public class LeetCode2697 {
}
