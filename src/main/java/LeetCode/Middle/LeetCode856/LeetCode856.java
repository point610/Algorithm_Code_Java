package LeetCode.Middle.LeetCode856;

import java.util.Stack;

class Solution {
    public int scoreOfParentheses(String s) {

        Stack<Integer> stack = new Stack<>();


        for (int i = 0; i < s.length(); i++) {
            char cc = s.charAt(i);
            if (cc == '(') {
                stack.push(-1);
            } else {
                int temp = 0;
                while (!stack.isEmpty() && stack.peek() != -1) {
                    temp += stack.pop();
                }
                if (!stack.isEmpty()) {
                    stack.pop();
                }
                stack.push(temp == 0 ? 1 : 2 * temp);
            }
        }

        int res = 0;
        while (!stack.isEmpty()) {
            res += stack.pop();
        }

        return res;
    }
}

public class LeetCode856 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.scoreOfParentheses("()"));
        System.out.println(solution.scoreOfParentheses("(())"));
        System.out.println(solution.scoreOfParentheses("()()"));
        System.out.println(solution.scoreOfParentheses("(()(()))"));
    }
}
