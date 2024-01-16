package LeetCode.Easy.LeetCode997;

/**
 * @ClassName LeetCode997
 * @Description TODO
 * @Author point
 * @Date 2023/8/15 23:58
 * @Version 1.0
 */
class Solution {
    public int findJudge(int n, int[][] trust) {
        int size = n;
        int[] out = new int[n];
        int[] in = new int[n];
        int tempSize = trust.length;
        for (int i = 0; i < tempSize; i++) {
            out[trust[i][0] - 1]++;
            in[trust[i][1] - 1]++;
        }
        // 遍历找到

        for (int i = 0; i < size; i++) {
            if (out[i] == 0 && in[i] == n - 1) {
                return i + 1;
            }
        }
        return -1;
    }
}

public class LeetCode997 {
}
