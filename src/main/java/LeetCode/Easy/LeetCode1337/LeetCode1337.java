package LeetCode.Easy.LeetCode1337;

import java.util.Arrays;

/**
 * @ClassName LeetCode1337
 * @Description TODO
 * @Author point
 * @Date 2023/9/17 10:59
 * @Version 1.0
 */
class Node {
    int junrenNumber;

    int i;

    public Node(int junrenNumber, int i) {
        this.junrenNumber = junrenNumber;
        this.i = i;
    }
}

class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int row = mat.length;
        int column = mat[0].length;
        Node[] nodes = new Node[row];
        for (int i = 0; i < row; i++) {
            int oneNumber = 0;
            for (int j = 0; j < column; j++) {
                if (mat[i][j] == 0) {
                    break;
                }
                oneNumber++;
            }
            nodes[i] = new Node(oneNumber, i);
        }
        Arrays.sort(nodes, (o1, o2) -> {
            if (o1.junrenNumber != o2.junrenNumber) {
                return o1.junrenNumber - o2.junrenNumber;
            }
            return o1.i - o2.i;
        });
        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            ans[i] = nodes[i].i;
        }
        return ans;
    }
}

public class LeetCode1337 {

}
