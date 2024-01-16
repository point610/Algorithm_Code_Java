package LeetCode.Middle.LeetCode71;

import java.util.Stack;

/**
 * @ClassName LeetCode71
 * @Description TODO
 * @Author point
 * @Date 2023/10/25 23:33
 * @Version 1.0
 */
class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] split = path.split("/");
        int size = split.length;
        for (int i = 0; i < size; i++) {
            if (!"".equals(split[i])) {
                if (".".equals(split[i])) {

                } else if (split[i].equals("..")) {
                    if (!stack.isEmpty()) {
                        stack.pop();
                    }
                } else {
                    stack.add(split[i]);
                }
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        if (stack.isEmpty()) {
            stringBuilder.append('/');
            return stringBuilder.toString();
        }
        Stack<String> temp = new Stack<>();
        while (!stack.isEmpty()) {
            temp.add(stack.pop());
        }
        while (!temp.isEmpty()) {
            stringBuilder.append('/');
            stringBuilder.append(temp.pop());
        }
        return stringBuilder.toString();
    }
}

public class LeetCode71 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.simplifyPath(
                "/..."
        ));
    }
}
