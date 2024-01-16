package CodeTop.HW.HW20;

import java.util.Stack;

/**
 * @ClassName HW20
 * @Description TODO
 * @Author point
 * @Date 2023/12/23 15:47
 * @Version 1.0
 */
class Solution {
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();
        for (Character cc : s.toCharArray()) {
            if (cc == '(' || cc == '[' || cc == '{') {
                stack.add(cc);
            } else if (cc == ')') {
                if (!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                } else {
                    return false;
                }
            } else if (cc == ']') {
                if (!stack.isEmpty() && stack.peek() == '[') {
                    stack.pop();
                } else {
                    return false;
                }
            } else if (cc == '}') {
                if (!stack.isEmpty() && stack.peek() == '{') {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}

public class HW20 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isValid("()"));
        System.out.println(solution.isValid("()[]{}"));
        System.out.println(solution.isValid("(]"));
    }
}
