package LeetCode.Middle.LeetCode1690;

class Solution {
    public int stoneGameVII(int[] stones) {
        int size = stones.length;

        int[][] sss = new int[size][size];
        for (int i = 0; i < size; i++) {
            int sum = 0;
            for (int j = i; j < size; j++) {
                sum += stones[j];
                sss[i][j] = sum;
            }
        }

        // 不需要对dp的对角线进行赋值，因为选完之后只剩下0
        int[][] dp = new int[size][size];
        for (int i = size - 1; i >= 0; i--) {
            for (int j = i + 1; j < size; j++) {
                dp[i][j] = Math.max(sss[i + 1][j] - dp[i + 1][j], sss[i][j - 1] - dp[i][j - 1]);
            }
        }

        return dp[0][size - 1];
    }
}

public class LeetCode1690 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.stoneGameVII(new int[]{5, 3, 1, 4, 2}));
        System.out.println(solution.stoneGameVII(new int[]{7, 90, 5, 1, 100, 10, 10, 2}));
    }
}
