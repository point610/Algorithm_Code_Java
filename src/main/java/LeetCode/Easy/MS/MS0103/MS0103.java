package LeetCode.Easy.MS.MS0103;

/**
 * @ClassName MS0103
 * @Description TODO
 * @Author point
 * @Date 2023/10/10 19:42
 * @Version 1.0
 */
class Solution {
    public String replaceSpaces(String S, int length) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            if (S.charAt(i) == ' ') {
                stringBuilder.append("%20");
            } else {
                stringBuilder.append(S.charAt(i));
            }
        }
        return stringBuilder.toString();
    }
}

public class MS0103 {
    public static void main(String[] args) {
    }
}
