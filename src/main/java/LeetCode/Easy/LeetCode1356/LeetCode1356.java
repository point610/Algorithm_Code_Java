package LeetCode.Easy.LeetCode1356;

import java.util.Arrays;

/**
 * @ClassName LeetCode1356
 * @Description TODO
 * @Author point
 * @Date 2023/9/17 11:15
 * @Version 1.0
 */
class Node {
    int oneNumber = 0;

    int index;

    public Node(int n, int index) {
        String string = Integer.toBinaryString(n);
        int size = string.length();
        for (int i = 0; i < size; i++) {
            if (string.charAt(i) == '1') {
                this.oneNumber++;
            }
        }
        this.index = index;
    }
}

class Solution {
    public int[] sortByBits(int[] arr) {
        int size = arr.length;
        Node[] nodes = new Node[size];
        for (int i = 0; i < size; i++) {
            nodes[i] = new Node(arr[i], arr[i]);
        }
        Arrays.sort(nodes, (o1, o2) -> {
            if (o1.oneNumber != o2.oneNumber) {
                return o1.oneNumber - o2.oneNumber;
            }
            return o1.index - o2.index;
        });
        int[] res = new int[size];
        for (int i = 0; i < size; i++) {
            res[i] = nodes[i].index;
        }
        return res;
    }
}

public class LeetCode1356 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.sortByBits(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8});
    }
}
