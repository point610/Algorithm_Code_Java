package CodeTop.HW.HW316;

import java.util.*;

/**
 * @ClassName HW316
 * @Description TODO
 * @Author point
 * @Date 2023/12/25 16:49
 * @Version 1.0
 */

class Solution {
    public String removeDuplicateLetters(String s) {
        int size = s.length();
        Map<Character, Integer> map = new HashMap<>();
        for (Character cc : s.toCharArray()) {
            map.put(cc, map.getOrDefault(cc, 0) + 1);
        }
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < size; i++) {
            char cc = s.charAt(i);
            if (stack.isEmpty()) {
                stack.add(cc);
                map.put(cc, map.get(cc) - 1);
                continue;
            }
            while (!stack.isEmpty() && cc < stack.peek() && map.get(stack.peek()) > 0&&!stack.contains(cc)) {
                stack.pop();
            }
            if (!stack.contains(cc)) {
                stack.add(cc);
            }
            map.put(cc, map.get(cc) - 1);
        }
        StringBuilder stringBuilder = new StringBuilder();
        while (!stack.isEmpty()) {
            stringBuilder.insert(0, stack.pop());
        }
        return stringBuilder.toString();
    }
}

public class HW316 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.removeDuplicateLetters("bcabc"));
        System.out.println(solution.removeDuplicateLetters("cbacdcbc"));
        System.out.println(solution.removeDuplicateLetters("abacb"));
    }
}
