package CodeTop.TX.TXLCR161;

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

public class TXLCR161 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.maxSales(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
        System.out.println(solution.maxSales(new int[]{5, 4, -1, 7, 8}));
    }
}
