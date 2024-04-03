package temp.xp.xp2;

import java.util.*;

public class Solution {
    private class Node {
        int value;
        int index;

        public Node(int value, int index) {
            this.value = value;
            this.index = index;
        }
    }

    public int[] solution(int[] costs, int coins) {
        int size = costs.length;
        if (size < 1) {
            return new int[]{};
        }
        List<Node> list = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            list.add(new Node(costs[i], i));
        }
        Collections.sort(list, new Comparator<Node>() {
            @Override
            public int compare(Node o1, Node o2) {
                return o1.value - o2.value;
            }
        });
        if (coins < list.get(0).value) {
            return new int[]{};
        }

        List<Node> nodes = new ArrayList<>();

        int index = 0;
        while (index < size && coins - list.get(index).value >= 0) {
            coins -= list.get(index).value;
            nodes.add(new Node(list.get(index).value, list.get(index).index));
            index++;
        }
        Collections.sort(nodes, new Comparator<Node>() {
            @Override
            public int compare(Node o1, Node o2) {
                return o1.index - o2.index;
            }
        });

        int[] ans = new int[nodes.size()];
        for (int i = 0; i < nodes.size(); i++) {
            ans[i] = nodes.get(i).value;
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.solution(new int[]{1, 1, 1, 1, 1}, 3)));
        System.out.println(Arrays.toString(solution.solution(new int[]{2, 1, 3, 4, 5}, 10)));
        System.out.println(Arrays.toString(solution.solution(new int[]{10, 5, 6, 11, 2, 3}, 10)));
        System.out.println(Arrays.toString(solution.solution(new int[]{15, 10, 11, 10}, 5)));
    }
}







