package CodeTop.TX.TX1047;

import java.util.Stack;

class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        for (char cc : s.toCharArray()) {
            if (stack.isEmpty()) {
                stack.add(cc);
            } else {
                if (stack.peek() == cc) {
                    stack.pop();
                } else {
                    stack.add(cc);
                }
            }
        }

        StringBuilder stringBuilder = new StringBuilder();
        while (!stack.isEmpty()) {
            stringBuilder.insert(0, stack.pop());
        }

        return stringBuilder.toString();
    }
}

public class TX1047 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.removeDuplicates("abbaca"));
    }
}
