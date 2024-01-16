package LeetCode.Easy.LeetCode2099;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @ClassName LeetCode2099
 * @Description TODO
 * @Author point
 * @Date 2023/9/30 19:21
 * @Version 1.0
 */
class Node {
    int index;

    int value;

    public Node(int index, int value) {
        this.index = index;
        this.value = value;
    }
}

class Solution {
    public int[] maxSubsequence(int[] nums, int k) {

        Node[] nodes = new Node[k];
        int[] res = new int[k];
        int size = nums.length;
        Node[] ordernodes = new Node[size];
        for (int i = 0; i < size; i++) {
            ordernodes[i] = new Node(i, nums[i]);
        }
        Arrays.sort(ordernodes, Comparator.comparingInt(o -> o.value));


        for (int i = 0; i < k; i++) {
            nodes[i] = ordernodes[size + i - k];
        }

        Arrays.sort(nodes, Comparator.comparingInt(o -> o.index));
        for (int i = 0; i < k; i++) {
            res[i] = nodes[i].value;
        }
        return res;
    }
}

public class LeetCode2099 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.maxSubsequence(new int[]{2, 1, 3, 3}, 2);
    }
}
