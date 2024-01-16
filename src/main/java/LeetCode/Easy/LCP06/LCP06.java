package LeetCode.Easy.LCP06;

/**
 * @ClassName LCP06
 * @Description TODO
 * @Author point
 * @Date 2023/9/20 23:33
 * @Version 1.0
 */
    class Solution {
        public int minCount(int[] coins) {
            int size = coins.length;
            int res = 0;
            for (int i = 0; i < size; i++) {
                res += ((coins[i] + 1) / 2);
            }
            return res;

        }
    }

public class LCP06 {
}
