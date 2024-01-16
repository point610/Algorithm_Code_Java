package LeetCode.Middle.LeetCode1155;

/**
 * @ClassName LeetCode1155
 * @Description TODO
 * @Author point
 * @Date 2023/10/24 22:53
 * @Version 1.0
 */
class Solution {


    public int numRollsToTarget(int n, int k, int target) {
        int[][] times = new int[n + 1][target + 1];
        times[0][0] = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= target; j++) {
                for (int l = 1; l <= k; l++) {
                    // k为骰子的数
                    if (j - l >= 0) {
                        times[i][j] = (times[i][j] + times[i - 1][j - l]) % 1000000007;
                    } else {
                        break;
                    }
                }
            }
        }

        return times[n][target];
    }
}

public class LeetCode1155 {
}
