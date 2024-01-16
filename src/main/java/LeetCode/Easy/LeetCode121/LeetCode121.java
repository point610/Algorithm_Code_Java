package LeetCode.Easy.LeetCode121;

/**
 * @ClassName LeetCode121
 * @Description TODO
 * @Author point
 * @Date 2023/10/1 0:36
 * @Version 1.0
 */
class Solution {
    public int maxProfit(int[] prices) {
        int size = prices.length;
        int max = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < size; i++) {
            min = Math.min(min, prices[i]);
            max = Math.max(max, prices[i] - min);
        }
        return max;

    }
}

public class LeetCode121 {
}
