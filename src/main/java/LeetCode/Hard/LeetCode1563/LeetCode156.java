package LeetCode.Hard.LeetCode1563;

class Solution {
    private int[][] sum;
    private int[][] dp;

    public int stoneGameV(int[] stoneValue) {
        int size = stoneValue.length;
        sum = new int[size][size];
        for (int i = 0; i < size; i++) {
            int temp = 0;
            for (int j = i; j < size; j++) {
                temp += stoneValue[j];
                sum[i][j] = temp;
            }
        }

        dp = new int[size][size];

        DFS(0, size - 1);

        return dp[0][size - 1];
    }

    private int DFS(int left, int right) {
        if (left >= right) {
            return 0;
        }
        // 不理解
        if (dp[left][right] != 0) {
            return dp[left][right];
        }

        // 不能等于right，需要取到 i+1，i+1<=right
        for (int i = left; i < right; i++) {
            int lsum = sum[left][i];
            int rsum = sum[i + 1][right];

            if (lsum < rsum) {
                dp[left][right] = Math.max(dp[left][right], DFS(left, i) + lsum);
            } else if (lsum > rsum) {
                dp[left][right] = Math.max(dp[left][right], DFS(i + 1, right) + rsum);
            } else {
                // ==
                dp[left][right] = Math.max(dp[left][right], Math.max(DFS(i + 1, right) + rsum, DFS(left, i) + lsum));
            }
        }
        return dp[left][right];
    }
}

public class LeetCode156 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.stoneGameV(new int[]{6, 2, 3, 4, 5, 5}));
        System.out.println(solution.stoneGameV(new int[]{7, 7, 7, 7, 7, 7, 7}));
        System.out.println(solution.stoneGameV(new int[]{4}));
    }
}
