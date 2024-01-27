package CodeTop.HW.HW365;

import java.util.*;

class Solution {
    public class Node {
        int one;
        int two;

        public Node(int one, int two) {
            this.one = one;
            this.two = two;
        }
    }

    public boolean canMeasureWater(int jug1Capacity, int jug2Capacity, int targetCapacity) {
        Queue<Node> nodeQueue = new LinkedList<>();
        nodeQueue.add(new Node(0, 0));
        // 使用set来存储遍历过的node的状态
        Set<Long> set = new HashSet<>();
        while (!nodeQueue.isEmpty()) {
            if (set.contains(hash(nodeQueue.peek()))) {
                nodeQueue.poll();
                continue;
            }
            set.add(hash(nodeQueue.peek()));

            Node node = nodeQueue.poll();
            int one = node.one;
            int two = node.two;

            if (one == targetCapacity || two == targetCapacity || (one + two) == targetCapacity) {
                return true;
            }

            nodeQueue.offer(new Node(jug1Capacity, two));
            nodeQueue.offer(new Node(one, jug2Capacity));
            nodeQueue.offer(new Node(0, two));
            nodeQueue.offer(new Node(one, 0));
            nodeQueue.offer(new Node(one + Math.min(jug1Capacity - one, two), two - Math.min(jug1Capacity - one, two)));
            nodeQueue.offer(new Node(one - Math.min(one, jug2Capacity - two), two + Math.min(one, jug2Capacity - two)));
        }
        return false;
    }

    private Long hash(Node node) {
        int one = node.one;
        int two = node.two;

        return one * 1000001L + two;

    }
}

public class HW365 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.canMeasureWater(3, 5, 4));
        System.out.println(solution.canMeasureWater(2, 6, 5));
        System.out.println(solution.canMeasureWater(1, 2, 3));
        System.out.println(solution.canMeasureWater(104579, 104593, 12444));
    }
}
