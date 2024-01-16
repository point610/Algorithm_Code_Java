package CodeTop.HW.HW1006;

import java.util.Collections;
import java.util.Stack;

/**
 * @ClassName HW1006
 * @Description TODO
 * @Author point
 * @Date 2023/12/29 9:58
 * @Version 1.0
 */
class Solution {
    public int clumsy(int n) {
        int index = 0;
        char[] cc = new char[]{'*', '/', '+', '-'};
        Stack<Integer> number = new Stack<>();
        number.add(n);
        Stack<Character> sign = new Stack<>();
        for (int i = n - 1; i >= 1; i--) {
            if (cc[index % 4] == '/' || cc[index % 4] == '*') {
                int one = number.pop();
                int two = i;
                char ccc = cc[index % 4];
                int result = jisuan(one, ccc, two);

                number.add(result);
            } else {
                number.add(i);
                sign.add(cc[index % 4]);
            }
            index++;
        }
        Collections.reverse(number);
        Collections.reverse(sign);
        while (!sign.isEmpty()) {
            int one = number.pop();
            int two = number.pop();
            char ccc = sign.pop();

            number.add(jisuan(one, ccc, two));
        }

        return number.pop();
    }

    private int jisuan(int one, char cc, int two) {
        switch (cc) {
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
                return (int) Math.floor(one * 1.0 / two);
            }
        }
        return 0;
    }
}

public class HW1006 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.clumsy(4));
        System.out.println(solution.clumsy(10));
    }
}
