package LeetCode.Middle.LeetCode50;

/**
 * @ClassName LeetCode50
 * @Description TODO
 * @Author point
 * @Date 2023/11/10 23:55
 * @Version 1.0
 */
class Solution {
    public double myPow(double x, int n) {
        double res = 1;
        if (x == 0) {
            return 0;
        }
        long b = n;
        if (b < 0) {
            x = 1 / x;
            b = -b;
        }

        while (b > 0) {
            if ((b & 1) == 1) {
                res *= x;
            }
            x *= x;
            b >>= 1;
        }
        return res;
    }
}

public class LeetCode50 {
}
