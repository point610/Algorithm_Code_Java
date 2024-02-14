package CodeTop.TX.TX20;

import java.util.Stack;

    class Solution {
        public boolean isValid(String s) {
            Stack<Character> stack = new Stack<>();
            for (char cc : s.toCharArray()) {
                switch (cc) {
                    case '(':
                    case '[':
                    case '{': {
                        stack.add(cc);
                        break;
                    }
                    case ')': {
                        if (stack.isEmpty() || stack.peek() != '(') {
                            return false;
                        }
                        stack.pop();
                        break;
                    }
                    case ']': {
                        if (stack.isEmpty() || stack.peek() != '[') {
                            return false;
                        }
                        stack.pop();
                        break;
                    }
                    case '}': {
                        if (stack.isEmpty() || stack.peek() != '{') {
                            return false;
                        }
                        stack.pop();
                        break;
                    }
                }
            }
            return stack.isEmpty();
        }
    }

public class TX20 {
}
