package LeetCode.Easy.LeetCode1544;

import java.util.Stack;

/**
 * @ClassName LeetCode1544
 * @Description TODO
 * @Author point
 * @Date 2023/9/27 23:31
 * @Version 1.0
 */
class Solution {
    public String makeGood(String s) {
        Stack<Character> stack = new Stack<>();
        int size = s.length();
        for (int i = 0; i < size; i++) {
            if (!stack.isEmpty()) {
                if (Math.abs(stack.peek() - s.charAt(i)) == 32) {
                    stack.pop();
                } else {
                    stack.add(s.charAt(i));
                }
            } else {
                stack.add(s.charAt(i));
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        while (!stack.isEmpty()) {
            stringBuilder.append(stack.pop());
        }
        return stringBuilder.reverse().toString();
    }
}

public class LeetCode1544 {
    public static void main(String[] args) {
        System.out.println('A' - 'a');
    }
}
