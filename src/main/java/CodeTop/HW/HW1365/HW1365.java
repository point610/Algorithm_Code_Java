package CodeTop.HW.HW1365;

import java.util.*;

/**
 * @ClassName HW1365
 * @Description TODO
 * @Author point
 * @Date 2023/12/24 15:37
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

    public int[] smallerNumbersThanCurrent(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int ii : nums) {
            map.put(ii, map.getOrDefault(ii, 0) + 1);
        }
        List<Node> nodes = new ArrayList<>();
        for (Integer key : map.keySet()) {
            nodes.add(new Node(key, map.get(key)));
        }

        Collections.sort(nodes, Comparator.comparingInt(o -> o.value));
        int sum = 0;
        Map<Integer, Node> nodeMap = new HashMap<>();
        for (Node nn : nodes) {
            nodeMap.put(nn.value, new Node(nn.value, sum));
            sum += nn.times;
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nodeMap.get(nums[i]).times;
        }
        return nums;
    }
}

public class HW1365 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.smallerNumbersThanCurrent(new int[]{8, 1, 2, 2, 3})));
    }
}
