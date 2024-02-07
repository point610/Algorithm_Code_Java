package CodeTop.HW.HW32;

import java.util.Stack;

class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        int size = s.length();
        for (int i = 0; i < size; i++) {
            if (stack.isEmpty()) {
                stack.add(i);
                continue;
            }
            if (s.charAt(i) == '(') {
                stack.add(i);
            } else {
                char cc = s.charAt(stack.peek());
                if (cc == '(') {
                    stack.pop();
                } else {
                    stack.add(i);
                }
            }
        }
        if (stack.isEmpty()) {
            return size;
        }
        int current = stack.pop();
        int max = size - current - 1;


        while (!stack.isEmpty()) {
            int temp = stack.pop();
            int step = current - temp;
            max = Math.max(max, step - 1);
            current = temp;
        }
        max = Math.max(max, current);
        return max;
    }
}

public class HW32 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.longestValidParentheses("())"));
        System.out.println(solution.longestValidParentheses("(()"));
        System.out.println(solution.longestValidParentheses(")()())"));
        System.out.println(solution.longestValidParentheses(""));
    }
}
