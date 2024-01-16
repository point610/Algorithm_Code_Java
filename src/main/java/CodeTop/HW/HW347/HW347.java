package CodeTop.HW.HW347;

import java.util.*;

/**
 * @ClassName HW347
 * @Description TODO
 * @Author point
 * @Date 2023/12/29 11:50
 * @Version 1.0
 */
class Solution {
    private class Node {
        int value;

        int times;

        public Node(int value, int times) {
            this.value = value;
            this.times = times;
        }
    }

    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int ii : nums) {
            map.put(ii, map.getOrDefault(ii, 0) + 1);
        }
        List<Node> list = new ArrayList<>();
        for (Integer key : map.keySet()) {
            list.add(new Node(key, map.get(key)));
        }

        Collections.sort(list, (o1, o2) -> o2.times - o1.times);

        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = list.get(i).value;
        }
        return res;
    }
}

public class HW347 {
}
