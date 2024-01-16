package LeetCode.Middle.LeetCode122;

/**
 * @ClassName LeetCode122
 * @Description TODO
 * @Author point
 * @Date 2023/11/7 22:47
 * @Version 1.0
 */
class Solution {
    public int maxProfit(int[] prices) {
        int size = prices.length;
        int sum = 0;
        for (int i = 1; i < size; i++) {
            if (prices[i - 1] < prices[i]) {
                sum += prices[i] - prices[i - 1];
            }
        }
        return sum;
    }
}

public class LeetCode122 {
}
