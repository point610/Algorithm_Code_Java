package CodeTop.HW.HW227;

import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

/**
 * @ClassName HW227
 * @Description TODO
 * @Author point
 * @Date 2023/12/25 16:00
 * @Version 1.0
 */
class Solution {
    public int calculate(String s) {
        s = s.replaceAll(" ", "");
        String[] one = s.split("[+\\-*/]");
        String[] two = s.split("[0-9]+");
        Stack<Long> number = new Stack<>();
        Stack<Character> sign = new Stack<>();
        int oneindex = 0;
        int twoindex = 1;
        number.add(Long.parseLong(one[0]));
        oneindex++;
        while (oneindex < one.length && twoindex < two.length) {
            if (two[twoindex].charAt(0) == '+' || two[twoindex].charAt(0) == '-') {
                sign.add(two[twoindex].charAt(0));
                twoindex++;
                number.add(Long.parseLong((one[oneindex])));
                oneindex++;
            } else {
                long oo = number.pop();
                long tt = Integer.parseInt(one[oneindex]);
                long temp = jisuan(oo, two[twoindex].charAt(0), tt);
                number.add(temp);
                oneindex++;
                twoindex++;
            }
        }
        Collections.reverse(number);
        Collections.reverse(sign);
        while (!sign.isEmpty()) {
            long oo = number.pop();
            long tt = number.pop();
            char cc = sign.pop();
            long temp = jisuan(oo, cc, tt);
            number.add(temp);
        }
        return number.pop().intValue();
    }

    private long jisuan(long one, char sign, long two) {
        switch (sign) {
            case '+': {
                return one + two;
            }
            case '-': {
                return one - two;
            }
            case '*': {
                return one * two;
            }
            case '/': {
                return one / two;
            }
        }
        return 0;
    }
}

public class HW227 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        // System.out.println(solution.calculate("3+2*2"));
        // System.out.println(solution.calculate(" 3/2 "));
        // System.out.println(solution.calculate(" 3+5 / 2 "));
        // System.out.println(solution.calculate("0-2147483647"));
        // System.out.println(solution.calculate("1*2"));
        // System.out.println(solution.calculate("1-1+1"));
        System.out.println(solution.calculate("12-3*4"));
    }
}
