package LeetCode.Middle.LeetCode29;

/**
 * @ClassName LeetCode29
 * @Description TODO
 * @Author point
 * @Date 2023/7/20 18:47
 * @Version 1.0
 */
class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE) {
            if (divisor == 1) {
                return dividend;
            }
            if (divisor == -1) {
                return Integer.MAX_VALUE;
            }
        }
        if (divisor == Integer.MIN_VALUE) {
            return dividend == Integer.MIN_VALUE ? 1 : 0;
        }
        if (dividend == 0) {
            return 0;
        }

        boolean zhegnshu = dividend > 0 && divisor > 0 || dividend < 0 && divisor < 0;

        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);
        if (divisor == 1) {
            return zhegnshu ? dividend : -dividend;
        }
        int sum = 0;
        while (dividend - divisor >= 0) {
            dividend -= divisor;
            sum++;
        }


        return zhegnshu ? sum : -sum;
    }
}

public class LeetCode29 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.divide(-2147483648, -2));
    }
}
