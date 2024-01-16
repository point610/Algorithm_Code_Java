package CodeTop.HW.HW1249;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

/**
 * @ClassName HW1249
 * @Description TODO
 * @Author point
 * @Date 2023/12/29 17:23
 * @Version 1.0
 */
class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> stack = new Stack<>();
        int size = s.length();
        for (int i = 0; i < size; i++) {
            if (s.charAt(i) == '(') {
                stack.add(i);
            } else if (s.charAt(i) == ')') {
                if (stack.isEmpty()) {
                    stack.add(i);
                } else if (s.charAt(stack.peek()) == '(') {
                    stack.pop();
                } else {
                    stack.add(i);
                }
            }
        }

        Set<Integer> set = new HashSet<>();
        while (!stack.isEmpty()) {
            set.add(stack.pop());
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < size; i++) {
            if (set.contains(i)) {
                continue;
            }
            stringBuilder.append(s.charAt(i));
        }
        return stringBuilder.toString();
    }
}

public class HW1249 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.minRemoveToMakeValid("lee(t(c)o)de)"));
        System.out.println(solution.minRemoveToMakeValid("a)b(c)d"));
        System.out.println(solution.minRemoveToMakeValid("))(("));
    }
}
