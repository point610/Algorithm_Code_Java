package CodeTop.HW.HW57;

import java.util.*;

class Solution {
    private class Node {
        int left;
        int right;

        public Node(int left, int right) {
            this.left = left;
            this.right = right;
        }
    }

    public int[][] insert(int[][] intervals, int[] newInterval) {
        int size = intervals.length;
        if (size == 0) {
            return new int[][]{newInterval};
        }
        int left = intervals[0][0];
        int right = intervals[0][1];

        List<Node> list = new LinkedList<>();
        for (int i = 1; i < size; i++) {
            int[] iii = intervals[i];
            int lll = iii[0];
            int rrr = iii[1];

            if (lll <= right) {
                right = Math.max(right, rrr);
            } else {
                list.add(new Node(left, right));
                left = lll;
                right = rrr;
            }
        }
        list.add(new Node(left, right));


        Node node = new Node(newInterval[0], newInterval[1]);
        list.add(node);
        Collections.sort(list, new Comparator<Node>() {
            @Override
            public int compare(Node o1, Node o2) {
                return o1.left - o2.left;
            }
        });

        List<Node> aaa = new LinkedList<>();
        left = list.get(0).left;
        right = list.get(0).right;
        size = list.size();
        for (int i = 1; i < size; i++) {
            int lll = list.get(i).left;
            int rrr = list.get(i).right;

            if (lll <= right) {
                right = Math.max(right, rrr);
            } else {
                aaa.add(new Node(left, right));
                left = lll;
                right = rrr;
            }
        }
        aaa.add(new Node(left, right));
        size = aaa.size();
        int[][] res = new int[size][2];
        for (int i = 0; i < size; i++) {
            res[i][0] = aaa.get(i).left;
            res[i][1] = aaa.get(i).right;
        }
        return res;
    }
}

public class HW57 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.deepToString(solution.insert(new int[][]{{1, 3}, {6, 9}}, new int[]{2, 5})));
        System.out.println(Arrays.deepToString(solution.insert(new int[][]{{1, 2}, {3, 5}, {6, 7}, {8, 10}, {12, 16}}, new int[]{4, 8})));
        System.out.println(Arrays.deepToString(solution.insert(new int[][]{}, new int[]{5, 7})));
        System.out.println(Arrays.deepToString(solution.insert(new int[][]{{1, 5}}, new int[]{2, 3})));
        System.out.println(Arrays.deepToString(solution.insert(new int[][]{{1, 5}}, new int[]{2, 7})));
    }
}
