package CodeTop.HW.HW1081;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

class Solution {
    public String smallestSubsequence(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char cc : s.toCharArray()) {
            map.put(cc, map.getOrDefault(cc, 0) + 1);
        }

        Stack<Character> stack = new Stack<>();
        for (char cc : s.toCharArray()) {
            if (stack.isEmpty()) {
                map.put(cc, map.get(cc) - 1);
                stack.add(cc);
                continue;
            }

            while (!stack.isEmpty() && stack.peek() >= cc && map.get(stack.peek()) > 0 && !stack.contains(cc)) {
                stack.pop();
            }
            if (!stack.contains(cc)) {
                stack.add(cc);
            }
            // 无论对stack怎么操作，map都必须将cc减掉
            map.put(cc, map.get(cc) - 1);
        }
        StringBuilder stringBuilder = new StringBuilder();
        while (!stack.isEmpty()) {
            stringBuilder.append(stack.pop());
        }
        return stringBuilder.reverse().toString();
    }
}

public class HW1081 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.smallestSubsequence("bcabc"));
        System.out.println(solution.smallestSubsequence("cbacdcbc"));
    }
}
