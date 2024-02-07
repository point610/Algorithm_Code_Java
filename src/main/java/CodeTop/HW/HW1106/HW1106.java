package CodeTop.HW.HW1106;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Solution {
    public boolean parseBoolExpr(String expression) {
        Stack<Character> stack = new Stack<>();

        int size = expression.length();
        for (int i = 0; i < size; i++) {
            char cc = expression.charAt(i);
            if (stack.isEmpty()) {
                stack.add(cc);
                continue;
            }
            if (cc == '(' || cc == '!' || cc == '&' || cc == '|' || cc == 'f' || cc == 't') {
                stack.add(cc);
            } else if (cc == ')') {
                List<Boolean> list = new ArrayList<>();
                while (!stack.isEmpty() && stack.peek() != '(') {
                    list.add(getboolean(stack.pop()));
                }
                stack.pop();
                char type = stack.pop();
                boolean res = list.get(0);

                switch (type) {
                    case '&': {
                        for (int j = 1; j < list.size(); j++) {
                            res = res & list.get(j);
                        }
                        break;
                    }
                    case '|': {
                        for (int j = 1; j < list.size(); j++) {
                            res = res | list.get(j);
                        }
                        break;
                    }
                    case '!': {
                        res = !res;
                        break;
                    }
                }
                stack.add(gettype(res));
            }
        }

        return getboolean(stack.pop());

    }

    private boolean getboolean(char cc) {
        if (cc == 'f') {
            return false;
        }
        return true;
    }

    private char gettype(boolean temp) {
        if (temp) {
            return 't';
        }
        return 'f';
    }

}

public class HW1106 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.parseBoolExpr("&(|(f))"));
        System.out.println(solution.parseBoolExpr("|(f,f,f,t)"));
        System.out.println(solution.parseBoolExpr("!(&(f,t))"));
    }
}
