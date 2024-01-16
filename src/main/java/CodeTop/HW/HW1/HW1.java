package CodeTop.HW.HW1;

import java.util.*;

/**
 * @ClassName HW1
 * @Description TODO
 * @Author point
 * @Date 2023/12/23 16:14
 * @Version 1.0
 */
class Solution {
    private class Node {
        int value;

        int index;

        public Node(int value, int index) {
            this.value = value;
            this.index = index;
        }
    }

    public int[] twoSum(int[] nums, int target) {
        List<Node> nodes = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            nodes.add(new Node(nums[i], i));
        }
        Collections.sort(nodes, new Comparator<Node>() {
            @Override
            public int compare(Node o1, Node o2) {
                return o1.value - o2.value;
            }
        });
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            if (nodes.get(left).value + nodes.get(right).value == target) {
                if (nodes.get(left).index < nodes.get(right).index) {
                    return new int[]{nodes.get(left).index, nodes.get(right).index};
                } else {
                    return new int[]{nodes.get(right).index, nodes.get(left).index};
                }
            }else if (nodes.get(left).value + nodes.get(right).value < target){
                left++;

            }else {
                right--;

            }

        }
        return new int[]{0, 0};

    }
}

public class HW1 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.twoSum(new int[]{2, 7, 11, 15}, 9)));
        System.out.println(Arrays.toString(solution.twoSum(new int[]{3, 2, 4}, 6)));
        System.out.println(Arrays.toString(solution.twoSum(new int[]{3, 3}, 6)));
    }
}
