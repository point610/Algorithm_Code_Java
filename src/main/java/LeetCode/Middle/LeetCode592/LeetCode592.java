package LeetCode.Middle.LeetCode592;

import java.math.BigInteger;

class Solution {
    private class Node {
        int one;
        int two;

        public Node(int one, int two) {
            this.one = one;
            this.two = two;
        }

        @Override
        public String toString() {
            return one + "/" + two;
        }
    }

    private Node yuefen(Node node) {
        int one = node.one;
        int two = node.two;
        int mod = gcd(Math.abs(one), two);

        return new Node(one / mod, two / mod);
    }

    private int gcd(int one, int two) {
        return new BigInteger(String.valueOf(one)).gcd(new BigInteger(String.valueOf(two))).intValue();
    }


    public String fractionAddition(String expression) {
        Node temp = new Node(0, 1);
        int sign = 1;
        for (int i = 0; i < expression.length(); i++) {
            char cc = expression.charAt(i);
            if (cc == '+') {
                sign = 1;
            } else if (cc == '-') {
                sign = -1;
            } else if (cc == '/') {
                StringBuilder ooosss = new StringBuilder();
                int ooindex = i - 1;
                while (ooindex >= 0 && Character.isDigit(expression.charAt(ooindex))) {
                    ooosss.insert(0, expression.charAt(ooindex));
                    ooindex--;
                }
                int one = sign * Integer.parseInt(String.valueOf(ooosss));

                StringBuilder tttsss = new StringBuilder();
                int ttindex = i + 1;
                while (ttindex < expression.length() && Character.isDigit(expression.charAt(ttindex))) {
                    tttsss.append(expression.charAt(ttindex));
                    ttindex++;
                }
                int two = Integer.parseInt(String.valueOf(tttsss));

                Node node = new Node(one, two);
                temp = add(temp, node);
            }
        }
        return temp.toString();
    }

    private Node add(Node temp, Node node) {
        int one = temp.one * node.two + temp.two * node.one;
        int two = temp.two * node.two;
        return yuefen(new Node(one, two));
    }
}

public class LeetCode592 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.fractionAddition("-5/2+10/3+7/9"));
        System.out.println(solution.fractionAddition("-1/2+1/2"));
        System.out.println(solution.fractionAddition("-1/2+1/2+1/3"));
        System.out.println(solution.fractionAddition("1/3-1/2"));
    }
}























