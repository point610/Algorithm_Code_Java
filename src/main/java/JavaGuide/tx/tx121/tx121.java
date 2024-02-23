package JavaGuide.tx.tx121;

class Solution {
    public int maxProfit(int[] prices) {
        int cost = Integer.MAX_VALUE;
        int size = prices.length;
        int res = 0;
        for (int i = 0; i < size; i++) {
            cost = Math.min(cost, prices[i]);
            res = Math.max(res, prices[i] - cost);
        }
        return res;
    }
}

public class tx121 {
}
