package LeetCode.Hard.LeetCode32;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * @ClassName LeetCode32
 * @Description TODO
 * @Author point
 * @Date 2023/11/28 23:31
 * @Version 1.0
 */
class Solution {

    public int longestValidParentheses(String s) {
        int size = s.length();
        if (size == 0) {
            return 0;
        }
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < size; i++) {
            if (stack.isEmpty() || s.charAt(i) == '(') {
                stack.add(i);
            } else if (s.charAt(i) == ')') {
                if (s.charAt(stack.peek()) == ')') {
                    stack.add(i);
                } else {
                    stack.pop();
                }
            }
        }
        List<Integer> list = new LinkedList<>();
        while (!stack.isEmpty()) {
            list.add(stack.pop());
        }

        int tempsize = list.size();
        if (tempsize == 0) {
            return size;
        }


        int maxstep = Math.max(size - list.get(0) - 1, list.get(tempsize - 1));
        for (int i = 1; i < tempsize; i++) {
            maxstep = Math.max(maxstep, list.get(i - 1) - list.get(i) - 1);
        }

        return maxstep;
    }
}

public class LeetCode32 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.longestValidParentheses(")()())"));
    }
}
