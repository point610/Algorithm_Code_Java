package CodeTop.HW.HW518;

class Solution {

    public int change(int amount, int[] coins) {
        int[] dp = new int[amount + 1];
        dp[0] = 1;

        for (int j = 0; j < coins.length; j++) {
            int current = coins[j];
            for (int i = current; i <= amount; i++) {
                if (i - current >= 0) {
                    dp[i] += dp[i - current];
                }
            }
        }
        return dp[amount];
    }
}

public class HW518 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.change(5, new int[]{1, 2, 5}));
        System.out.println(solution.change(3, new int[]{2}));
        System.out.println(solution.change(10, new int[]{10}));
        System.out.println(solution.change(500, new int[]{3, 5, 7, 8, 9, 10, 11}));
    }
}
