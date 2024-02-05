package CodeTop.HW.HW224;

import java.util.*;

class Solution {
    public int calculate(String s) {
        // 为符号的栈，存储 1 或者 -1
        Deque<Integer> ops = new LinkedList<>();
        ops.push(1);
        int sign = 1;

        int ret = 0;
        int n = s.length();
        int i = 0;
        while (i < n) {
            if (s.charAt(i) == ' ') {
                i++;
            } else if (s.charAt(i) == '+') {
                sign = ops.peek();
                i++;
            } else if (s.charAt(i) == '-') {
                // 将符号反转
                sign = -ops.peek();
                i++;
            } else if (s.charAt(i) == '(') {
                // 将括号之前的符号存储
                ops.push(sign);
                i++;
            } else if (s.charAt(i) == ')') {
                // 将括号之前的符号去出
                ops.pop();
                i++;
            } else {
                long num = 0;
                while (i < n && Character.isDigit(s.charAt(i))) {
                    num = num * 10 + s.charAt(i) - '0';
                    i++;
                }
                // 及时将数字计算完成
                ret += sign * num;
            }
        }
        return ret;
    }
}


public class HW224 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.calculate(" 2-1 + 2 "));
        System.out.println(solution.calculate("1-(     -2)"));
        System.out.println(solution.calculate("- (3 + (4 + 5))"));
        System.out.println(solution.calculate("1 + 1"));
        System.out.println(solution.calculate("(1+(4+5+2)-3)+(6+8)"));
    }
}
