package LeetCode.Middle.LeetCode921;

import java.util.Stack;

class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.add(c);
            } else {
                if (stack.isEmpty() || stack.peek() != '(') {
                    stack.add(c);
                } else {
                    stack.pop();
                }
            }
        }
        return stack.size();
    }
}

public class LeetCode921 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.minAddToMakeValid("())"));
    }
}
