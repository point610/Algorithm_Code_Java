package CodeTop.HW.HW394;

import java.util.Stack;

/**
 * @ClassName HW394
 * @Description TODO
 * @Author point
 * @Date 2023/12/26 9:18
 * @Version 1.0
 */
class Solution {
    public String decodeString(String s) {

        Stack<Integer> number = new Stack<>();
        Stack<StringBuilder> sign = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '[') {
                sign.add(new StringBuilder("["));
            } else if (s.charAt(i) == ']') {
                StringBuilder cc = sign.pop();
                StringBuilder add = new StringBuilder();
                int nn = number.pop();
                for (int j = 0; j < nn; j++) {
                    add.append(cc);
                }
                sign.pop();
                while (!sign.isEmpty() && !sign.peek().toString().equals("[")) {
                    add.insert(0, sign.pop());
                }
                sign.add(add);
            } else if (Character.isDigit(s.charAt(i))) {
                StringBuilder nn = new StringBuilder();
                while (i < s.length() && Character.isDigit(s.charAt(i))) {
                    nn.append(s.charAt(i));
                    i++;
                }
                number.add(Integer.parseInt(nn.toString()));
                i--;
            } else {

                StringBuilder cc = new StringBuilder();
                while (i < s.length() && Character.isLowerCase(s.charAt(i))) {
                    cc.append(s.charAt(i));
                    i++;
                }
                while (!sign.isEmpty() && !sign.peek().toString().equals("[")) {
                    cc.insert(0, sign.pop());
                }

                sign.add(cc);
                i--;
            }
        }
        StringBuilder res = new StringBuilder();
        while (!sign.isEmpty()) {
            if (sign.peek().toString().equals("[")) {
                sign.pop();
                continue;
            }
            res.insert(0, sign.pop());
        }
        return res.toString();

    }
}

public class HW394 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.decodeString("sd2[f2[e]g]i"));
        System.out.println(solution.decodeString("3[a]2[bc]"));
        System.out.println(solution.decodeString("3[a2[c]]"));
        System.out.println(solution.decodeString("2[abc]3[cd]ef"));
        System.out.println(solution.decodeString("abc3[cd]xyz"));
    }
}
