package LeetCode.Easy.LeetCode1957;

/**
 * @ClassName LeetCode1957
 * @Description TODO
 * @Author point
 * @Date 2023/9/29 17:32
 * @Version 1.0
 */
class Solution {
    public String makeFancyString(String s) {
        int size = s.length();
        if (size <= 2) {
            return s;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < size - 2; i++) {
            if (s.charAt(i) == s.charAt(i + 1) && s.charAt(i + 1) == s.charAt(i + 2)) {
            } else {
                stringBuilder.append(s.charAt(i));
            }
        }
        stringBuilder.append(s.charAt(size - 2));
        stringBuilder.append(s.charAt(size - 1));
        return stringBuilder.toString();
    }
}

public class LeetCode1957 {
}
