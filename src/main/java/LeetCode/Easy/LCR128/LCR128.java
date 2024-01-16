package LeetCode.Easy.LCR128;

/**
 * @ClassName LCR128
 * @Description TODO
 * @Author point
 * @Date 2023/10/8 23:46
 * @Version 1.0
 */
class Solution {
    public int stockManagement(int[] stock) {
        int min = Integer.MAX_VALUE;
        int size = stock.length;
        for (int i = 0; i < size; i++) {
            min = Math.min(min, stock[i])
            ;
        }return min;
    }
}

public class LCR128 {
}
