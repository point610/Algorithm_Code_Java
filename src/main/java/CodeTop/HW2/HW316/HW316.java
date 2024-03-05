package CodeTop.HW2.HW316;


import javax.management.StringValueExp;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

class Solution {
    public String removeDuplicateLetters(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char cc = s.charAt(i);
            if (stack.isEmpty()) {
                stack.add(cc);
                map.put(cc, map.get(cc) - 1);
                continue;
            }

            // 加入cc的各种情况
            while (!stack.isEmpty() && !stack.contains(cc) && map.get(stack.peek()) > 0 && stack.peek() > cc) {
                stack.pop();
            }
            if (!stack.contains(cc)) {
                stack.push(cc);
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
}
