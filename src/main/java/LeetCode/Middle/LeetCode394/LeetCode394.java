package LeetCode.Middle.LeetCode394;

import java.util.Stack;

/**
 * @ClassName LeetCode394
 * @Description TODO
 * @Author point
 * @Date 2023/11/13 22:39
 * @Version 1.0
 */
class Solution {
    public String decodeString(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        Stack<Character> cc = new Stack<>();
        Stack<Integer> nn = new Stack<>();
        int size = s.length();
        for (int i = 0; i < size; i++) {
            if (s.charAt(i) == '[') {
                cc.add(s.charAt(i));
            } else if (s.charAt(i) == ']') {
                StringBuilder temp = new StringBuilder();
                while (cc.peek() != '[') {
                    temp.append(cc.pop());
                }
                cc.pop();
                temp = temp.reverse();
                int times = nn.pop();
                for (int j = 0; j < times; j++) {
                    int tempsize = temp.length();
                    for (int k = 0; k < tempsize; k++) {
                        cc.add(temp.charAt(k));
                    }
                }
            } else if ('0' <= s.charAt(i) && s.charAt(i) <= '9') {
                int index = i;
                while ('0' <= s.charAt(index) && s.charAt(index) <= '9') {
                    index++;
                }
                nn.add(Integer.parseInt(s.substring(i, index)));
                i = index-1;
            } else {
                cc.add(s.charAt(i));
            }

        }
        while (!cc.isEmpty()) {
            stringBuilder.append(cc.pop());
        }
        return stringBuilder.reverse().toString();

    }
}

public class LeetCode394 {
    public static void main(String[] args) {
        Solution
                solution = new Solution();
        System.out.println(solution.decodeString("100[leetcode]"));
    }
}
