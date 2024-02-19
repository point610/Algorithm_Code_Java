package CodeTop.TX.TX227;

import java.util.Stack;

class Solution {

    public int calculate(String s) {
        s = s.replaceAll(" ", "");
        Stack<Character> sign = new Stack<>();
        Stack<Integer> number = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char cc = s.charAt(i);
            if ('0' <= cc && cc <= '9') {
                //  读取数字
                int temp = 0;
                while ('0' <= cc && cc <= '9') {
                    temp = temp * 10 + (cc - '0');
                    i++;
                    if (i >= s.length()) {
                        break;
                    }
                    cc = s.charAt(i);
                }
                i--;
                if (sign.isEmpty() ||( sign.peek() != '/' && sign.peek() != '*')) {
                    number.add(temp);
                } else {
                    // * /
                    int one = number.pop();
                    int two = temp;
                    int res = 0;
                    char tempsign = sign.pop();
                    switch (tempsign) {
                        case '*': {
                            res = one * two;
                            break;
                        }
                        case '/': {
                            res = one / two;
                            break;
                        }
                    }
                    number.add(res);
                }
            } else {
                sign.add(cc);
            }
        }
        // 反转sign和number
        Stack<Character> tempsign = new Stack<>();
        Stack<Integer> tempnumber = new Stack<>();
        while (!sign.isEmpty()) {
            tempsign.add(sign.pop());
        }
        while (!number.isEmpty()) {
            tempnumber.add(number.pop());
        }
        while (!tempsign.isEmpty()) {
            char cc = tempsign.pop();
            int one = tempnumber.pop();
            int two = tempnumber.pop();
            int res = 0;
            switch (cc) {
                case '+': {
                    res = one + two;
                    break;
                }
                case '-': {
                    res = one - two;
                    break;
                }
            }
            tempnumber.add(res);
        }
        return tempnumber.pop();
    }
}

public class TX227 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.calculate("3+2*2"));
        System.out.println(solution.calculate(" 3/2 "));
        System.out.println(solution.calculate(" 3+5 / 2 "));
    }
}
