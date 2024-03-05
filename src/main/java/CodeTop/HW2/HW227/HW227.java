package CodeTop.HW2.HW227;

import java.util.Stack;

class Solution {
    public int calculate(String s) {
        s = s.replaceAll(" ", "");
        Stack<Integer> number = new Stack<>();
        Stack<Character> sign = new Stack<>();

        int size = s.length();
        for (int i = 0; i < size; i++) {
            char cc = s.charAt(i);
            if ('0' <= cc && cc <= '9') {
                // 数字
                int temp = 0;
                while ('0' <= cc && cc <= '9') {
                    temp = temp * 10 + (cc - '0');
                    i++;
                    if (i >= size) {
                        break;
                    }
                    cc = s.charAt(i);
                }
                i--;
                if (!sign.isEmpty() && (sign.peek() == '/' || sign.peek() == '*')) {
                    int one = number.pop();
                    if (sign.peek() == '/') {
                        sign.pop();
                        one = one / temp;
                    } else if (sign.peek() == '*') {
                        sign.pop();
                        one = one * temp;
                    }
                    number.add(one);
                } else {
                    number.add(temp);
                }
            } else {
                sign.add(cc);
            }
        }
        Stack<Integer> tempnumber = new Stack<>();
        Stack<Character> tempsign = new Stack<>();
        while (!number.isEmpty()) {
            tempnumber.add(number.pop());
        }
        while (!sign.isEmpty()) {
            tempsign.add(sign.pop());
        }
        while (!tempsign.isEmpty()) {
            int one = tempnumber.pop();
            int two = tempnumber.pop();
            if (tempsign.peek() == '-') {
                tempsign.pop();
                tempnumber.add(one - two);
            } else {
                tempnumber.add(one + two);
                tempsign.pop();

            }

        }
        return tempnumber.pop();
    }
}

public class HW227 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.calculate("3+2*2"));
        System.out.println(solution.calculate(" 3/2 "));
        System.out.println(solution.calculate(" 3+5 / 2 "));
    }
}
