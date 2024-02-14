package CodeTop.TX.TX121;

import java.util.Map;

class Solution {
    public int maxProfit(int[] prices) {
        int cost = Integer.MAX_VALUE;
        int max = 0;
        for (int iii : prices) {
            cost = Math.min(cost, iii);
            max = Math.max(max, iii - cost);
        }

        return max;
    }
}

public class TX121 {
}
