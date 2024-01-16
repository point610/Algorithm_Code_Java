package CodeTop.HW.HW402;

import java.math.BigInteger;
import java.util.Stack;

/**
 * @ClassName HW402
 * @Description TODO
 * @Author point
 * @Date 2023/12/25 17:01
 * @Version 1.0
 */
class Solution {
    public String removeKdigits(String num, int k) {

        Stack<Character> stack = new Stack<>();
        for (Character cc : num.toCharArray()) {
            if (stack.isEmpty()) {
                stack.add(cc);
                continue;
            }

            while (k != 0 && !stack.isEmpty() && stack.peek() > cc) {
                stack.pop();
                k--;
            }
            stack.add(cc);
        }
        while (k != 0) {
            k--;
            stack.pop();
        }
        StringBuilder stringBuilder = new StringBuilder();
        while (!stack.isEmpty()) {
            stringBuilder.append(stack.pop());
        }
        stringBuilder = stringBuilder.reverse();
        if (stringBuilder.length() == 0) {
            return "0";
        }
        return String.valueOf(new BigInteger(String.valueOf(stringBuilder)));
    }
}

public class HW402 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.removeKdigits("1432219", 3));
        System.out.println(solution.removeKdigits("10200", 1));
        System.out.println(solution.removeKdigits("10", 2));
        System.out.println(solution.removeKdigits("1234567890", 9));

    }
}
