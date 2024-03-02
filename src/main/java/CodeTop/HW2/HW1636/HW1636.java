package CodeTop.HW2.HW1636;

import java.util.*;

class Solution {
    private class Node {
        int value;
        int times;

        public Node(int value, int times) {
            this.value = value;
            this.times = times;
        }
    }

    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Node> list = new ArrayList<>();
        for (int key : map.keySet()) {
            list.add(new Node(key, map.get(key)))
            ;
        }
        Collections.sort(list, new Comparator<Node>() {
            @Override
            public int compare(Node o1, Node o2) {
                if (o1.times == o2.times) {
                    return o2.value - o1.value;
                }
                return o1.times - o2.times;
            }
        });

        int[] res = new int[nums.length];
        int index = 0;
        for (Node node : list) {
            for (int i = 0; i < node.times; i++) {
                res[index++] = node.value;
            }
        }
        return res;
    }
}

public class HW1636 {
}
