package LeetCode.Easy.LeetCode1636;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName LeetCode1636
 * @Description TODO
 * @Author point
 * @Date 2023/9/28 12:46
 * @Version 1.0
 */
class Node {
    int value;

    int times;

    public Node(int value, int times) {
        this.value = value;
        this.times = times;
    }
}

class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int size = nums.length;
        for (int i = 0; i < size; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        Node[] nodes = new Node[map.size()];
        int index = 0;
        for (Integer key : map.keySet()) {
            nodes[index++] = new Node(key, map.get(key));
        }
        Arrays.sort(nodes, (o1, o2) -> {
            if (o1.times == o2.times) {
                return o2.value - o1.value;
            } else {
                return o1.times - o2.times;
            }
        });
        int[] res = new int[size];
        index = 0;
        size = nodes.length;
        for (int i = 0; i < size; i++) {
            Node node = nodes[i];
            for (int j = 0; j < node.times; j++) {
                res[index++] = node.value;
            }

        }
        return res;

    }
}

public class LeetCode1636 {
}
