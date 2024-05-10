package LeetCode.Middle.LeetCode640;

class Solution {
    private class Node {
        int xpre;
        int value;

        public Node(int xpre, int value) {
            this.xpre = xpre;
            this.value = value;
        }
    }

    private Node getNode(String one) {
        int xpre = 0;
        int value = 0;

        int sign = 1;
        int tempvalue = 1;
        for (int i = 0; i < one.length(); i++) {
            char cc = one.charAt(i);
            if (cc == '-') {
                sign = -1;
            } else if (cc == '+') {
                sign = 1;
            } else if (cc == 'x') {
                xpre += sign * tempvalue;
                tempvalue = 1;
            } else if (Character.isDigit(cc)) {
                tempvalue = 0;
                while (i < one.length() && Character.isDigit(one.charAt(i))) {
                    tempvalue = tempvalue * 10 + (one.charAt(i) - '0');
                    i++;
                }
                i--;
                if (i == one.length() - 1) {
                    value += sign * tempvalue;
                    tempvalue = 1;
                } else if (one.charAt(i + 1) != 'x') {
                    value += sign * tempvalue;
                    tempvalue = 1;
                }
            }
        }
        return new Node(xpre, value);
    }

    public String solveEquation(String equation) {
        String[] split = equation.split("=");
        Node left = getNode(split[0]);
        Node right = getNode(split[1]);

        if (left.xpre - right.xpre == 0 && left.value - right.value != 0) {
            return "No solution";
        }
        if (left.xpre == right.xpre) {
            return "Infinite solutions";
        }

        if (left.xpre < right.xpre) {
            Node temp = left;
            left = right;
            right = temp;
        }

        int xpre = left.xpre - right.xpre;
        int value = right.value - left.value;
        if (value % xpre == 0) {
            return "x=" + value / xpre;
        }

        return "No solution";
    }
}

public class LeetCode640 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solveEquation("1-x+x-x+x+x=-99-2x+x-x+x"));
        System.out.println(solution.solveEquation("3x=33+22+11"));
        System.out.println(solution.solveEquation("-x=-1"));
        System.out.println(solution.solveEquation("x=x+2"));
        System.out.println(solution.solveEquation("x+5-3+x=6+x-2"));
        System.out.println(solution.solveEquation("x=x"));
        System.out.println(solution.solveEquation("2x=x"));
    }
}















