package CodeTop.TX.TX678;

import java.util.Stack;

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
            return nohas(s);
        }
    }

    private boolean nohas(String s) {
        Stack<Integer> left = new Stack<>();
        int size = s.length();
        for (int i = 0; i < size; i++) {
            char cc = s.charAt(i);
            if (cc == '(') {
                left.add(i);
            } else {
                if (left.isEmpty()) {
                    return false;
                } else {
                    left.pop();
                }
            }
        }
        return left.isEmpty();
    }

    private boolean has(String s) {
        Stack<Integer> left = new Stack<>();
        Stack<Integer> xing = new Stack<>();
        int size = s.length();
        for (int i = 0; i < size; i++) {
            char cc = s.charAt(i);
            if (cc == '(') {
                left.add(i);
            } else if (cc == '*') {
                xing.add(i);
            } else {
                if (!left.isEmpty()) {
                    left.pop();
                } else if (!xing.isEmpty()) {
                    xing.pop();
                } else {
                    return false;
                }
            }
        }
        // xing为右括号
        if (left.size() > xing.size()) {
            return false;
        }
        // 判断index
        while (!left.isEmpty()) {
            if (left.pop() > xing.pop()) {
                return false;
            }
        }
        return true;
    }
}

public class TX678 {
}
