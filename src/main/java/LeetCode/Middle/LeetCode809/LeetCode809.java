package LeetCode.Middle.LeetCode809;

import java.util.ArrayList;
import java.util.List;

class Solution {
    private class Node {
        char cc;
        int times;

        public Node(char cc, int times) {
            this.cc = cc;
            this.times = times;
        }
    }

    private boolean can(List<Node> one, List<Node> two) {
        if (one.size() != two.size()) {
            return false;
        }
        for (int i = 0; i < one.size(); ++i) {
            if (one.get(i).cc != two.get(i).cc) {
                return false;
            }
            if (one.get(i).times < two.get(i).times) {
                return false;
            }
            if (one.get(i).times < 3 && two.get(i).times != one.get(i).times) {
                return false;
            }
        }
        return true;
    }

    public int expressiveWords(String s, String[] words) {
        List<Node> one = get(s);

        int res = 0;
        for (String word : words) {
            List<Node> two = get(word);
            if (can(one, two)) {
                res++;
            }
        }
        return res;
    }

    private List<Node> get(String one) {
        List<Node> list = new ArrayList<>();
        char cc = one.charAt(0);
        int times = 1;
        int size = one.length();
        for (int i = 1; i < size; i++) {
            char temp = one.charAt(i);

            if (i == size - 1) {
                if (temp == cc) {
                    times++;
                    list.add(new Node(cc, times));
                } else {
                    list.add(new Node(cc, times));
                    cc = temp;
                    times = 1;
                    list.add(new Node(cc, times));
                }
            } else {
                if (temp == cc) {
                    times++;
                } else {
                    list.add(new Node(cc, times));
                    cc = temp;
                    times = 1;
                }
            }

        }

        return list;
    }
}

public class LeetCode809 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.expressiveWords("heeellooo", new String[]{"hello", "hi", "helo"}));
    }
}













