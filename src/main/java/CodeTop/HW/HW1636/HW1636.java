package CodeTop.HW.HW1636;

import java.util.*;

/**
 * @ClassName HW1636
 * @Description TODO
 * @Author point
 * @Date 2023/12/23 21:53
 * @Version 1.0
 */
class Solution {
    private static class Node {
        int value;

        int times;

        public Node(int value, int times) {
            this.value = value;
            this.times = times;
        }
    }

    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer ii : nums) {
            map.put(ii, map.getOrDefault(ii, 0) + 1);
        }
        List<Node> list = new ArrayList<>();
        for (Integer key : map.keySet()) {
            list.add(new Node(key, map.get(key)));
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
        int index = 0;
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.get(i).times; j++) {
                nums[index++] = list.get(i).value;
            }
        }
        return nums;

    }
}

public class HW1636 {
}
