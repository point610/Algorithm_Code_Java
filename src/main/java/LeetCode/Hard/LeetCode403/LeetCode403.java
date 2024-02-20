package LeetCode.Hard.LeetCode403;

class Solution {
    public boolean canCross(int[] stones) {
        int size = stones.length;
        boolean[][] dp = new boolean[size][size];
        dp[0][0] = true;
        // 判断间隔
        for (int i = 1; i < size; i++) {
            if (stones[i] - stones[i - 1] > i) {
                // 间隔过大
                return false;
            }
        }

        for (int i = 1; i < size; i++) {
            for (int j = i - 1; j >= 0; j--) {
                int step = stones[i] - stones[j];
                // 间隔过大
                if (step > j + 1) {
                    break;
                }

                // 从三种步长得到
                dp[i][step] = dp[j][step - 1] || dp[j][step] || dp[j][step + 1];

                // 判断最后是否能够达到
                if (i == size - 1 && dp[i][step]) {
                    return true;
                }
            }
        }

        return false;
    }
}

public class LeetCode403 {
}
