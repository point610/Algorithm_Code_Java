package LeetCode.Easy.LCR181;

/**
 * @ClassName LCR181
 * @Description TODO
 * @Author point
 * @Date 2023/10/9 22:53
 * @Version 1.0
 */
class Solution {
    public String reverseMessage(String message) {
        String[] strings = message.split(" ");
        int size = strings.length;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = size - 1; i >= 0; i--) {
            if (!strings[i].equals("")) {
                stringBuilder.append(strings[i]);
                stringBuilder.append(' ');
            }
        }
        if (stringBuilder.length() == 0) {
            return "";
        }
        return stringBuilder.substring(0, stringBuilder.length() - 1).toString();
    }
}

public class LCR181 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.reverseMessage("  hello world!  "));
    }
}
