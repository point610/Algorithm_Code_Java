package CodeTop.HW.HW123;

class Solution {
    public int maxProfit(int[] prices) {
        int size = prices.length;
        int b = -prices[0];
        int s = 0;
        int bb = -prices[0];
        int ss = 0;
        for (int i = 1; i < size; i++) {
            b = Math.max(b, -prices[i]);
            s = Math.max(s, b + prices[i]);
            bb = Math.max(bb, s - prices[i]);
            ss = Math.max(ss, bb + prices[i]);
        }
        return ss;
    }
}

public class HW123 {
}
