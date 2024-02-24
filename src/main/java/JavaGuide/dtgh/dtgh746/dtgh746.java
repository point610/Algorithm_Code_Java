package JavaGuide.dtgh.dtgh746;


class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int size = cost.length;
        int[] dp = new int[size + 1];

        for (int i = 2; i <= size; i++) {
            dp[i] = Math.min(dp[i - 1] + cost[i - 1], dp[i - 2] + cost[i - 2]);
        }

        return dp[size];
    }
}

public class dtgh746 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.minCostClimbingStairs(new int[]{10, 15, 20}));
        System.out.println(solution.minCostClimbingStairs(new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1}));
    }
}
