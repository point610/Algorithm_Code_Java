package CodeTop.TX.TX122;

class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        for (int i = 1; i < prices.length; i++) {
            max += Math.max(0, prices[i] - prices[i - 1]);
        }
        return max;
    }
}

public class TX122 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
        System.out.println(solution.maxProfit(new int[]{1, 2, 3, 4, 5}));
        System.out.println(solution.maxProfit(new int[]{7, 6, 4, 3, 1}));
    }
}
