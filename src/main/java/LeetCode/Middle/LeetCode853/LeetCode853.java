package LeetCode.Middle.LeetCode853;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    private class Node {
        int pos;
        int speed;

        double times;

        public Node(int pos, int speed, int target) {
            this.pos = pos;
            this.speed = speed;
            this.times = (double) (target - pos) / speed;
        }
    }

    public int carFleet(int target, int[] position, int[] speed) {

        int size = position.length;

        if (size == 1) {
            return 1;
        }

        List<Node> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            Node node = new Node(position[i], speed[i], target);
            list.add(node);
        }

        list.sort((a, b) -> b.pos - a.pos);

        int rse = 0;

        for (int i = 1; i < size; i++) {
            Node preNode = list.get(i - 1);
            Node currentNode = list.get(i);
            if (currentNode.times > preNode.times) {
                rse++;
            } else {
                currentNode.times = preNode.times;
            }
        }

        Node preNode = list.get(size - 2);
        Node currentNode = list.get(size - 1);
        if (currentNode.times >= preNode.times) {
            rse++;
        }

        return rse == 0 ? 1 : rse;
    }
}

public class LeetCode853 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.carFleet(20, new int[]{6, 2, 17}, new int[]{3, 9, 2}));
        System.out.println(solution.carFleet(12, new int[]{10, 8, 0, 5, 3}, new int[]{2, 4, 1, 1, 3}));
        System.out.println(solution.carFleet(10, new int[]{3}, new int[]{3}));
        System.out.println(solution.carFleet(100, new int[]{0, 2, 4}, new int[]{4, 2, 1}));
        System.out.println(solution.carFleet(13, new int[]{10, 2, 5, 7, 4, 6, 11}, new int[]{7, 5, 10, 5, 9, 4, 1}));
    }
}













