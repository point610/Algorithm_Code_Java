package CodeTop.HW.HW1190;

import java.util.Stack;

/**
 * @ClassName HW1190
 * @Description TODO
 * @Author point
 * @Date 2023/12/29 17:01
 * @Version 1.0
 */
class Solution {
    public String reverseParentheses(String s) {
        Stack<String> stack = new Stack<>();
        int size = s.length();
        for (int i = 0; i < size; i++) {
            char cc = s.charAt(i);
            if (cc == '(') {
                stack.add("(");
            } else if (cc == ')') {
                StringBuilder stringBuilder = new StringBuilder();
                if (!stack.peek().equals("(")) {
                    stringBuilder = new StringBuilder(stack.pop());
                }
                if (!stack.isEmpty() && stack.peek().equals("(")) {
                    stack.pop();
                }
                StringBuilder pre = new StringBuilder();
                if (!stack.isEmpty() && !"(".equals(stack.peek())) {
                    pre.append(stack.pop());
                }
                stack.add(pre.append(stringBuilder.reverse()).toString());
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                while (i < size && Character.isLowerCase(s.charAt(i))) {
                    stringBuilder.append(s.charAt(i));
                    i++;
                }
                i--;
                StringBuilder pre = new StringBuilder();
                if (!stack.isEmpty() && !stack.peek().equals("(")) {
                    pre.append(stack.pop());
                }
                stack.add(pre.append(stringBuilder).toString());
            }
        }
        return stack.pop();
    }
}

public class HW1190 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        // System.out.println(solution.reverseParentheses("(abcd)"));
        System.out.println(solution.reverseParentheses("vdgzyj()"));
        System.out.println(solution.reverseParentheses("(u(love)i)"));
        System.out.println(solution.reverseParentheses("(ed(et(oc))el)"));
        System.out.println(solution.reverseParentheses("a(bcdefghijkl(mno)p)q"));
    }
}
