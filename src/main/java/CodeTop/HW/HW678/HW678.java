package CodeTop.HW.HW678;

import java.util.Stack;

/**
 * @ClassName HW678
 * @Description TODO
 * @Author point
 * @Date 2023/12/31 11:26
 * @Version 1.0
 */
class Solution {
    public boolean checkValidString(String s) {
        boolean hasxing = false;
        for (char cc : s.toCharArray()) {
            if (cc == '*') {
                hasxing = true;
                break;
            }
        }

        if (hasxing) {
            return has(s);
        } else {
            return no(s);
        }

    }

    private boolean no(String s) {
        Stack<Character> left = new Stack<>();
        for (char cc : s.toCharArray()) {
            if (cc == '(') {
                left.add(cc);
            } else if (cc == ')') {
                if (!left.isEmpty()) {
                    left.pop();
                } else {
                    return false;
                }
            }
        }
        return left.size() == 0;
    }

    private boolean has(String s) {
        Stack<Integer> left = new Stack<>();
        Stack<Integer> xing = new Stack<>();
        int index = 0;
        for (char cc : s.toCharArray()) {
            if (cc == '(') {
                left.add(index++);
            } else if (cc == '*') {
                xing.add(index++);
            } else if (cc == ')') {
                index++;
                if (!left.isEmpty()) {
                    left.pop();
                } else if (!xing.isEmpty()) {
                    xing.pop();
                } else {
                    return false;
                }
            }
        }

        if (left.size() > xing.size()) {
            return false;
        }

        while (!left.isEmpty() && !xing.isEmpty()) {
            int ll = left.pop();
            int xx = xing.pop();

            if (ll > xx) {
                return false;
            }

        }


        return true;

    }
}

public class HW678 {
}
