package LeetCode.Easy.LeetCode2706;

import java.util.Arrays;

/**
 * @ClassName LeetCode2706
 * @Description TODO
 * @Author point
 * @Date 2023/10/1 17:49
 * @Version 1.0
 */
class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        if ((prices[0] + prices[1]) <= money) {
            return money - (prices[0] + prices[1])
                    ;
        } else {
            return money
                    ;
        }
    }
}

public class LeetCode2706 {
}
