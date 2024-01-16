package LeetCode.Easy.LeetCode1221;

import java.util.Stack;

/**
 * @ClassName LeetCode1221
 * @Description TODO
 * @Author point
 * @Date 2023/8/19 0:01
 * @Version 1.0
 */
class Solution {
    public int balancedStringSplit(String s) {
        int size = s.length();
        Stack<Character> stack = new Stack<>();
        int res = 0;
        for (int i = 0; i < size; i++) {
            if (stack.empty()) {
                stack.push(s.charAt(i));
                continue;
            }

            if (stack.peek() != s.charAt(i)) {
                stack.pop();
            } else {
                stack.push(s.charAt(i));
            }
            if (stack.empty()) {
                res++;
            }
        }
        return res;
    }
}

public class LeetCode1221 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.balancedStringSplit("RLRRRLLRLL"));
    }
}
