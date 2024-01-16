package LeetCode.Easy.LeetCode441;

/**
 * @ClassName LeetCode441
 * @Description TODO
 * @Author point
 * @Date 2023/7/28 0:31
 * @Version 1.0
 */
class Solution {
    public int arrangeCoins(int n) {
        long temp = 0;
        for (int i = 0; i <= n; i++) {
            temp = (long) (1 + i) * i / 2;
            if (temp <= n && (temp + i + 1) > n) {
                return i;
            }
        }
        return 0;
    }
}

public class LeetCode441 {
}
