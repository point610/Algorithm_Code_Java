package CodeTop.HW2.HW394;

import java.util.Stack;

class Solution {
    public String decodeString(String s) {
        Stack<Integer> number = new Stack<>();
        Stack<String> strings = new Stack<>();
        int size = s.length();
        for (int i = 0; i < size; i++) {
            char cc = s.charAt(i);
            if (isNumber(cc)) {
                int temp = 0;
                while (isNumber(cc)) {
                    temp = temp * 10 + (cc - '0');
                    i++;
                    if (i >= size) {
                        break;
                    }
                    cc = s.charAt(i);
                }
                i--;
                number.add(temp);
            } else if (isChar(cc)) {
                StringBuilder temp = new StringBuilder();
                while (isChar(cc)) {
                    temp.append(cc);
                    i++;
                    if (i >= size) {
                        break;
                    }
                    cc = s.charAt(i);
                }
                i--;

                if (!strings.isEmpty() && !strings.peek().equals("[")) {
                    String pop = strings.pop();
                    strings.add(pop + temp);
                } else {
                    strings.add(temp.toString());
                }

            } else if (cc == '[') {
                strings.add(String.valueOf(cc));
            } else {
                int times = number.pop();
                String ss = strings.pop();
                StringBuilder stringBuilder = new StringBuilder();
                for (int j = 0; j < times; j++) {
                    stringBuilder.append(ss);
                }
                //出【
                strings.pop();

                if (!strings.isEmpty() && !strings.peek().equals("[")) {
                    String pop = strings.pop();
                    strings.add(pop + stringBuilder);
                } else {
                    strings.add(stringBuilder.toString());
                }
            }

        }
        return strings.pop();

    }

    private boolean isNumber(char cc) {
        return '0' <= cc && cc <= '9';
    }

    private boolean isChar(char cc) {
        return 'a' <= cc && cc <= 'z';
    }
}

public class HW394 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.decodeString("3[a]2[bc]"));
        System.out.println(solution.decodeString("3[a2[c]]"));
        System.out.println(solution.decodeString("2[abc]3[cd]ef"));
        System.out.println(solution.decodeString("abc3[cd]xyz"));
    }
}
