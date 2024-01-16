package LeetCode.Easy.LeetCode1678;

/**
 * @ClassName LeetCode1678
 * @Description TODO
 * @Author point
 * @Date 2023/9/28 14:51
 * @Version 1.0
 */
class Solution {
    public String interpret(String command) {
        int size = command.length();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < size; i++) {
            if (command.charAt(i) == 'G') {
                stringBuilder.append('G');
            } else if (command.charAt(i) == ')') {
                if (command.charAt(i - 1) == '(') {
                    stringBuilder.append('o');
                } else {
                    stringBuilder.append("al");
                }
            }
        }
        return stringBuilder.toString();
    }
}

public class LeetCode1678 {
}
