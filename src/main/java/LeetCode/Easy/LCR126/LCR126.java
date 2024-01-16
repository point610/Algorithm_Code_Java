package LeetCode.Easy.LCR126;

/**
 * @ClassName LCR126
 * @Description TODO
 * @Author point
 * @Date 2023/10/7 23:44
 * @Version 1.0
 */
class Solution {
    public int fib(int n) {
        if (n < 2) {
            return n;
        }
        int one = 0;
        int two = 1;
        for (int i = 2; i <= n; i++) {
            int sum = (one + two)%1000000007;
            one = two;
            two = sum;
        }
        return two;

    }
}

public class LCR126 {
}
