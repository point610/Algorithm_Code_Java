package LeetCode.Easy.LeetCode1816;

/**
 * @ClassName LeetCode1816
 * @Description TODO
 * @Author point
 * @Date 2023/9/28 19:46
 * @Version 1.0
 */
class Solution {
    public String truncateSentence(String s, int k) {
        String[] strings = s.split(" ");
        if (strings.length <= k) {
            return s;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < k; i++) {
            stringBuilder.append(strings[i]);
            if (i != k - 1) {
                stringBuilder.append(' ');
            }
        }
        return stringBuilder.toString();
    }
}

public class LeetCode1816 {
}
