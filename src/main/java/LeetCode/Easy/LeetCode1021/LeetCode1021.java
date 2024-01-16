package LeetCode.Easy.LeetCode1021;

import java.util.*;

/**
 * @ClassName LeetCode1021
 * @Description TODO
 * @Author point
 * @Date 2023/8/18 15:58
 * @Version 1.0
 */
class Solution {
    public String removeOuterParentheses(String s) {
        int size = s.length();
        Set<Integer> listIndex = new HashSet<>();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < size; i++) {
            if (s.charAt(i) == '(') {
                if (stack.isEmpty()) {
                    listIndex.add(i);
                }
                stack.push(s.charAt(i));
            } else {
                stack.pop();
                if (stack.empty()) {
                    listIndex.add(i);
                }
            }
        }

        StringBuilder res = new StringBuilder();
        for (int i = 0; i < size; i++) {
            if (!listIndex.contains(i)) {
                res.append(s.charAt(i));
            }
        }
        return String.valueOf(res);
    }
}

public class LeetCode1021 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.removeOuterParentheses("()()"));
    }
}
