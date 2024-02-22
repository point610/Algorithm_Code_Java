package CodeTop.TX.TX402;

import java.util.Stack;

class Solution {
    public String removeKdigits(String num, int k) {
        if (num.length() == k || num.equals("0")) {
            return "0";
        }
        Stack<Integer> stack = new Stack<>();
        int size = num.length();
        for (int i = 0; i < size; i++) {
            int cc = num.charAt(i) - '0';
            if (stack.isEmpty()) {
                stack.add(cc);
                continue;
            }
            while (k > 0 && !stack.isEmpty() && cc < stack.peek()) {
                stack.pop();
                k--;
            }
            stack.add(cc);
        }
        for (int i = 0; i < k; i++) {
            stack.pop();
        }
        StringBuilder stringBuilder = new StringBuilder();
        while (!stack.isEmpty()) {
            stringBuilder.append(stack.pop());
        }

        int startindex = 0;
        stringBuilder = stringBuilder.reverse();
        while (startindex < stringBuilder.length() && stringBuilder.charAt(startindex) == '0') {
            startindex++;
        }
        if (startindex == stringBuilder.length()) {
            return "0";
        }
        return stringBuilder.substring(startindex);
    }
}

public class TX402 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.removeKdigits("10001", 4));
        System.out.println(solution.removeKdigits("1234567890", 9));
        System.out.println(solution.removeKdigits("112", 1));
        System.out.println(solution.removeKdigits("10", 1));
        System.out.println(solution.removeKdigits("1432219", 3));
        System.out.println(solution.removeKdigits("10200", 1));
        System.out.println(solution.removeKdigits("10", 2));
    }
}
