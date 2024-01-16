package LeetCode.Easy.LeetCode1844;

/**
 * @ClassName LeetCode1844
 * @Description TODO
 * @Author point
 * @Date 2023/9/29 0:37
 * @Version 1.0
 */
class Solution {
    char shift(char c, int x) {
        return (char) (c + x);
    }

    public String replaceDigits(String s) {
        int size = s.length();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i < size; i += 2) {
            stringBuilder.append(s.charAt(i - 1));
            stringBuilder.append(shift(s.charAt(i - 1), s.charAt(i) - '0'));
        }
if ('a'<=s.charAt(size-1)&&s.charAt(size-1)<='z'){
    stringBuilder.append(s.charAt(size - 1));
}
        return stringBuilder.toString();
    }
}

public class LeetCode1844 {
}
