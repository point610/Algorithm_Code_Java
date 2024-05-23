package LeetCode.Middle.LeetCode787;

import java.util.Arrays;

class Solution {
    private int INF = 10000 * 101 + 1;

    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {

        // k为中转的次数
        int[][] list = new int[k + 2][n];

        for (int i = 0; i < k + 2; i++) {
            Arrays.fill(list[i], INF);
        }
        list[0][src] = 0;

        for (int i = 1; i < k + 2; i++) {
            for (int[] one : flights) {
                int from = one[0];
                int to = one[1];
                int cost = one[2];

                list[i][to] = Math.min(list[i][to], list[i - 1][from] + cost);

            }
        }

        int res = INF;

        for (int i = 1; i < k + 2; i++) {
            res = Math.min(res, list[i][dst]);
        }

        if (res >= INF) {
            return -1;
        } else {
            return res;
        }
    }
}

public class LeetCode787 {
}
