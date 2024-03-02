package CodeTop.HW2.HWLCR161;
class Solution {
    public int maxSales(int[] sales) {
        int max = sales[0];
        int size = sales.length;
        int[] dp = new int[size];
        dp[0] = sales[0];

        for (int i = 1; i < size; i++) {
            dp[i] = Math.max(dp[i - 1] + sales[i], sales[i]);
            max = Math.max(max, dp[i]);
        }
        return max;
    }
}

public class HWLCR161 {
}
