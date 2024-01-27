package CodeTop.HW.HW1353;

import java.util.*;

class Solution {
    public class Node {
        int left;
        int right;

        public Node(int left, int right) {
            this.left = left;
            this.right = right;
        }
    }

    public int maxEvents(int[][] events) {
        List<Node> llll = new ArrayList<>();
        for (int[] iiii : events) {
            llll.add(new Node(iiii[0], iiii[1]));
        }
        Collections.sort(llll, Comparator.comparingInt(o -> o.left));

        int count = 0;
        int index = 0;
        int size = llll.size();
        int tiem = 0;
        Queue<Node> queue = new PriorityQueue<>(Comparator.comparingInt(o -> o.right));

        while (tiem <= 100000) {
            tiem++;

            // 加入对应时间点的node
            while (index < size && llll.get(index).left <= tiem && tiem <= llll.get(index).right) {
                queue.add(llll.get(index));
                index++;
            }

            // 移除时间点之前的node
            while (!queue.isEmpty() && queue.peek().right < tiem) {
                queue.poll();
            }

            // 移除对应的queue
            if (!queue.isEmpty()) {
                queue.poll();
                count++;
            }
        }

        return count;
    }
}

public class HW1353 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.maxEvents(new int[][]{{1, 5}, {1, 5}, {1, 5}, {2, 3}, {2, 3}}));//5
        System.out.println(solution.maxEvents(new int[][]{{1, 4}, {4, 4}, {2, 2}, {3, 4}, {1, 1}}));//4
        System.out.println(solution.maxEvents(new int[][]{{1, 2}, {2, 3}, {3, 4}, {1, 2}}));//4
        System.out.println(solution.maxEvents(new int[][]{{1, 2}, {2, 3}, {3, 4}}));//3
    }
}
