package LeetCode.Middle.LeetCode537;

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
            return one + "+" + two + "i";
        }
    }

    public String complexNumberMultiply(String num1, String num2) {
        Node one = getnode(num1);
        Node two = getnode(num2);
        int oo = one.one * two.one - (one.two * two.two);
        int tt = one.one * two.two + one.two * two.one;
        return oo + "+" + tt + "i";
    }

    private Node getnode(String ss) {
        String[] split = ss.split("\\+");
        int one = Integer.parseInt(split[0]);
        int two = Integer.parseInt(split[1].split("i")[0]);
        Node node = new Node(one, two);
        return node;
    }
}

public class LeetCode537 {
}
