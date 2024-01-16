package LeetCode.Hard.LeetCode312;

/**
 * @ClassName LeetCode312
 * @Description TODO
 * @Author point
 * @Date 2023/11/26 18:38
 * @Version 1.0
 */
class Solution {
    public int maxCoins(int[] nums) {
        int size = nums.length;
        int[] value = new int[size + 2];
        value[0] = 1;
        value[size + 2 - 1] = 1;
        for (int i = 1; i < size + 2 - 1; i++) {
            value[i] = nums[i - 1];
        }
        int[][] dp = new int[size + 2][size + 2];

        //  开始dp
        for (int i = size - 1; i >= 0; i--) {
            for (int j = i + 2; j < size + 2; j++) {
                for (int k = i + 1; k < j; k++) {
                    int temp = value[i] * value[j] * value[k] + dp[i][k] + dp[k][j];
                    dp[i][j] = Math.max(dp[i][j], temp);
                }
            }
        }
        return dp[0][size + 1];
    }
}

public class LeetCode312 {
}
