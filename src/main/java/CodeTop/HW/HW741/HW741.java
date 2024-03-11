package CodeTop.HW.HW741;


import java.util.Arrays;

class Solution {
    public int cherryPickup(int[][] grid) {
        // 走 k 步，从 x1y1 和 x2y2 到 n-1n-1 可以得到的最多的樱桃数量
        int n = grid.length;
        int[][][] f = new int[n * 2 - 1][n][n];
        for (int i = 0; i < n * 2 - 1; ++i) {
            for (int j = 0; j < n; ++j) {
                Arrays.fill(f[i][j], Integer.MIN_VALUE);
            }
        }
        f[0][0][0] = grid[0][0];
        // 使用for循环遍历所有的步骤
        for (int k = 1; k < n * 2 - 1; ++k) {
            // 节点 xc1 走的x轴
            for (int x1 = Math.max(k - n + 1, 0); x1 <= Math.min(k, n - 1); ++x1) {
                // 校验不为障碍
                int y1 = k - x1;
                if (grid[x1][y1] == -1) {
                    continue;
                }
                // 节点 two 走的x轴
                for (int x2 = x1; x2 <= Math.min(k, n - 1); ++x2) {
                    // 校验不为障碍
                    int y2 = k - x2;
                    if (grid[x2][y2] == -1) {
                        continue;
                    }

                    int res = f[k - 1][x1][x2]; // 都往右
                    if (x1 > 0) {
                        res = Math.max(res, f[k - 1][x1 - 1][x2]); // 往下，往右
                    }
                    if (x2 > 0) {
                        res = Math.max(res, f[k - 1][x1][x2 - 1]); // 往右，往下
                    }
                    if (x1 > 0 && x2 > 0) {
                        res = Math.max(res, f[k - 1][x1 - 1][x2 - 1]); // 都往下
                    }
                    // xc1 的樱桃
                    res += grid[x1][y1];
                    // two 的樱桃
                    if (x2 != x1) { // 避免重复摘同一个樱桃
                        res += grid[x2][y2];
                    }
                    // 使用动态规划
                    f[k][x1][x2] = res;
                }
            }
        }
        return Math.max(f[n * 2 - 2][n - 1][n - 1], 0);
    }
}

public class HW741 {
}
