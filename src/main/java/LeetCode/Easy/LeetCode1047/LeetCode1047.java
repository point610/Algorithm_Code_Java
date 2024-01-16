package LeetCode.Easy.LeetCode1047;

import java.util.Stack;

/**
 * @ClassName LeetCode1047
 * @Description TODO
 * @Author point
 * @Date 2023/8/18 16:31
 * @Version 1.0
 */
class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        int size = s.length();
        for (int i = 0; i < size; i++) {
            if (stack.empty() || stack.peek() != s.charAt(i)) {
                stack.push(s.charAt(i));
                continue;
            }

            while (!stack.empty()&&stack.peek() == s.charAt(i)) {
                stack.pop();
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        while (!stack.empty()) {
            stringBuilder.insert(0, stack.pop());
        }
        return String.valueOf(stringBuilder);

    }
}

public class LeetCode1047 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.removeDuplicates("abbaca"));
    }
}
