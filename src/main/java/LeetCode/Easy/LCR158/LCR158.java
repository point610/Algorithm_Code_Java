package LeetCode.Easy.LCR158;

import java.util.Arrays;

/**
 * @ClassName LCR158
 * @Description TODO
 * @Author point
 * @Date 2023/10/9 18:49
 * @Version 1.0
 */
class Solution {
    public int inventoryManagement(int[] stock) {
        Arrays.sort(stock);
        return stock[stock.length / 2];
    }
}

public class LCR158 {
}
