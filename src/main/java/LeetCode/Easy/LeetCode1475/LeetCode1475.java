package LeetCode.Easy.LeetCode1475;

/**
 * @ClassName LeetCode1475
 * @Description TODO
 * @Author point
 * @Date 2023/9/27 15:57
 * @Version 1.0
 */
class Solution {
    public int[] finalPrices(int[] prices) {
        int size = prices.length;
        for (int i = 0; i < size; i++) {
            int current = prices[i];
            for (int j = i + 1; j < size; j++) {
                if (prices[j] <= current) {
                    prices[i] -= prices[j];break;
                }
            }

        }
        return prices;

    }
}

public class LeetCode1475 {
}
