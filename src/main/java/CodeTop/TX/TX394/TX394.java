package CodeTop.TX.TX394;

import java.util.Stack;

class Solution {
    public String decodeString(String s) {
        int size = s.length();
        Stack<String> stack = new Stack<>();
        Stack<Integer> number = new Stack<>();
        for (int i = 0; i < size; i++) {
            char cc = s.charAt(i);
            if (cc == '[') {
                stack.add(String.valueOf(cc));
            } else if ('0' <= cc && cc <= '9') {
                // 读取数字
                int temp = 0;
                while ('0' <= cc && cc <= '9') {
                    temp = temp * 10 + (cc - '0');
                    i++;
                    cc = s.charAt(i);
                }
                i--;
                number.add(temp);
            } else if (cc == ']') {
                StringBuilder stringBuilder = new StringBuilder(stack.pop());
                int times = number.pop();
                // 注意拼接之后去掉【 之后还需要拼接
                stringBuilder = getString(stringBuilder, times);
                // 去掉[
                stack.pop();
                // 判断是否还需要拼接前面的额string
                if (!stack.isEmpty() && !stack.peek().equals("[")) {
                    String temp = stack.pop();
                    stack.add(temp + stringBuilder);
                } else {
                    stack.add(stringBuilder.toString());
                }

            } else {
                StringBuilder stringBuilder = new StringBuilder();
                while ('a' <= cc && cc <= 'z') {
                    stringBuilder.append(cc);
                    i++;
                    if (i >= size) {
                        break;
                    }
                    cc = s.charAt(i);
                }
                i--;
                // 判断是否为[
                if (stack.isEmpty() || stack.peek().equals("[")) {
                    stack.add(stringBuilder.toString());
                } else {
                    // 需要拼接前面的string
                    String temp = stack.pop();
                    stack.add(temp + stringBuilder);
                }
            }
        }
        return stack.pop();
    }

    private StringBuilder getString(StringBuilder stringBuilder, int times) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < times; i++) {
            res.append(stringBuilder);
        }
        return res;
    }
}

public class TX394 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.decodeString("3[z]2[2[y]pq4[2[jk]e1[f]]]ef"));
        System.out.println(solution.decodeString("3[a]2[bc]"));
        System.out.println(solution.decodeString("3[a2[c]]"));
        System.out.println(solution.decodeString("2[abc]3[cd]ef"));
        System.out.println(solution.decodeString("abc3[cd]xyz"));
    }
}
