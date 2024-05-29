package LeetCode.Middle.LeetCode861;

class Solution {
    public int matrixScore(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        // 行变换，使得第一列都是1
        for (int i = 0; i < m; i++) {
            if (grid[i][0] == 0) {
                // 将第i行全部取反
                for (int j = 0; j < n; j++) {
                    grid[i][j] ^= 1;
                }
            }
        }
        // 列变换，使得剩下的都是1
        for (int j = 1; j < n; j++) {
            int cnt = 0;
            for (int i = 0; i < m; i++) {
                if (grid[i][j] == 1) {
                    cnt++;
                }
            }
            // 如果0比1多，将第j列全部取反
            if (cnt < m - cnt) {
                for (int i = 0; i < m; i++) {
                    grid[i][j] ^= 1;
                }
            }
        }

        // 计算得分

        int score = 0;

        for (int i = 0; i < m; i++) {

            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    score += (int) Math.pow(2, n - j - 1);
                }
            }

        }

        return score;
    }
}

public class LeetCode861 {
}
