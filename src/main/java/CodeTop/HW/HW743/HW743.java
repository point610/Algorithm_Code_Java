package CodeTop.HW.HW743;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {

    private long[][] lll;

    public int networkDelayTime(int[][] times, int n, int k) {
        lll = new long[n][n];
        k--;
        int size = times.length;

        // 初始化矩阵
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                lll[i][j] = Integer.MAX_VALUE;
            }
        }
        for (int i = 0; i < n; i++) {
            lll[i][i] = 0;
        }
        for (int i = 0; i < size; i++) {
            int start = times[i][0] - 1;
            int end = times[i][1] - 1;
            int time = times[i][2];
            lll[start][end] = time;
        }

        floyd();

        long maxValue = 0;
        for (int i = 0; i < n; i++) {
            if (lll[k][i] >= Integer.MAX_VALUE) {
                return -1;
            }
            maxValue = Math.max(maxValue, lll[k][i]);
        }
        return ((int) maxValue) == 0 ? -1 : ((int) maxValue);
    }

    private void floyd() {
        int size = lll.length;

        for (int k = 0; k < size; k++) {
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    lll[i][j] = Math.min(lll[i][j], lll[i][k] + lll[k][j]);
                }
            }
        }
    }
}

public class HW743 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.networkDelayTime(new int[][]{{1, 2, 1}, {2, 3, 2}, {1, 3, 1}}, 3, 2));
        System.out.println(solution.networkDelayTime(new int[][]{{1, 2, 1}}, 2, 2));
        System.out.println(solution.networkDelayTime(new int[][]{{2, 1, 1}, {2, 3, 1}, {3, 4, 1}}, 4, 2));
        System.out.println(solution.networkDelayTime(new int[][]{{1, 2, 1}}, 2, 1));
    }
}
