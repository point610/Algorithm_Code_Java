package LeetCode.Middle.LeetCode813;

class Solution {
    public double largestSumOfAverages(int[] nums, int k) {
        int size = nums.length;
        double[] prefix = new double[size + 1];
        for (int i = 0; i < size; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
        }
        double[][] dp = new double[size + 1][k + 1];
        for (int i = 1; i <= size; i++) {
            dp[i][1] = prefix[i] / i;
        }
        for (int times = 2; times <= k; times++) {
            for (int index = times; index <= size; index++) {
                for (int splitindex = times - 1; splitindex < index; splitindex++) {
                    dp[index][times] = Math.max(dp[index][times],
                            dp[splitindex][times - 1] + (prefix[index] - prefix[splitindex]) / (index - splitindex));
                }
            }
        }

        return dp[size][k];
    }
}

public class LeetCode813 {
}
