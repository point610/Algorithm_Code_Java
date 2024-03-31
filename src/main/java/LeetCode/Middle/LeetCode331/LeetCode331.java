package LeetCode.Middle.LeetCode331;

import java.util.Stack;

class Solution {
    public class Node {
        String value;
        int times;

        public Node(String value, int times) {
            this.value = value;
            this.times = times;
        }
    }

    public boolean isValidSerialization(String preorder) {
        String[] split = preorder.split(",");
        if (split.length == 1 && split[0].equals("#")) {
            return true;
        }
        Stack<Node> stack = new Stack<>();
        for (int i = 0; i < split.length; i++) {
            String ss = split[i];
            if (i != 0 && stack.isEmpty()) {
                return false;
            }
            if (ss.equals("#")) {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    stack.peek().times++;
                    if (stack.peek().times == 2) {
                        stack.pop();
                    }
                }
            } else {
                if (stack.isEmpty()) {
                    stack.add(new Node(ss, 0));
                } else {
                    stack.peek().times++;
                    if (stack.peek().times == 2) {
                        stack.pop();
                    }
                    stack.add(new Node(ss, 0));
                }
            }
        }

        return stack.isEmpty();
    }
}

public class LeetCode331 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isValidSerialization("9,3,4,#,#,1,#,#,#,2,#,6,#,#"));
        System.out.println(solution.isValidSerialization("9,3,4,#,#,1,#,#,2,#,6,#,#"));
        System.out.println(solution.isValidSerialization("1,#"));
        System.out.println(solution.isValidSerialization("9,#,#,1"));

    }
}
