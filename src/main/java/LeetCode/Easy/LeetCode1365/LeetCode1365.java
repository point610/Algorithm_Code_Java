package LeetCode.Easy.LeetCode1365;

import java.util.*;

/**
 * @ClassName LeetCode.Easy.LeetCode1365
 * @Description TODO
 * @Author point
 * @Date 2023/9/18 21:27
 * @Version 1.0
 */
class Node {
    int value;

    int order;

    int number;

    public Node(int value, int order, int number) {
        this.value = value;
        this.order = order;
        this.number = number;
    }
}

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        Map<Integer, Node> map = new HashMap<>();

        int size = nums.length;
        for (int i = 0; i < size; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], new Node(nums[i], 0, 1));
            } else {
                map.get(nums[i]).number++;
            }
        }
        // 开始排序
        int mapsize = map.size();
        Node[] nodes = new Node[mapsize];
        int index = 0;
        for (Integer key : map.keySet()) {
            nodes[index++] = map.get(key);
        }
        Arrays.sort(nodes, (o1, o2) -> o1.value - o2.value);
        int sum = 0;
        for (int i = 0; i < mapsize; i++) {
            nodes[i].order = sum;
            sum += nodes[i].number;
        }

        for (int i = 0; i < size; i++) {
            nums[i] = map.get(nums[i]).order;
        }
        return nums;
    }
}

public class LeetCode1365 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.smallerNumbersThanCurrent(new int[]{8, 1, 2, 2, 3});
    }
}
