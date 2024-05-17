package LeetCode.Middle.LeetCode826;

import java.util.*;

class Solution {
    private class Node {
        int diff;
        int pro;
        double order;

        public Node(int diff, int pro) {
            this.diff = diff;
            this.pro = pro;
            order = 1.0 * pro / diff;
        }
    }

    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int size = difficulty.length;
        List<Node> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            int diff = difficulty[i];
            int pro = profit[i];
            Node temp = new Node(diff, pro);
            list.add(temp);
        }
        Collections.sort(list, new Comparator<Node>() {
            @Override
            public int compare(Node o1, Node o2) {
                if (o1.diff == o2.diff) {
                    return Double.compare(o2.order, o1.order);
                }
                return o2.pro - o1.pro;
            }
        });

        int res = 0;
        for (int work : worker) {
            for (Node node : list) {
                if (work >= node.diff) {
                    res += node.pro;
                    break;
                }
            }
        }
        return res;
    }
}

public class LeetCode826 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.maxProfitAssignment(new int[]{68, 35, 52, 47, 86}, new int[]{67, 17, 1, 81, 3}, new int[]{92, 10, 85, 84, 82}));
        System.out.println(solution.maxProfitAssignment(new int[]{2, 4, 6, 8, 10}, new int[]{10, 20, 30, 40, 50}, new int[]{4, 5, 6, 7}));
        System.out.println(solution.maxProfitAssignment(new int[]{85, 47, 57}, new int[]{24, 66, 99}, new int[]{40, 25, 25}));
    }
}
