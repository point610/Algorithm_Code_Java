package CodeTop.HW.HW29;

class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == 0) {
            return 0;
        }
        if (divisor == 1) {
            return dividend;
        }
        if (divisor == -1) {
            if (dividend == Integer.MIN_VALUE) {
                return Integer.MAX_VALUE;
            }
            return -dividend;
        }
        long one = Math.abs((long) (dividend));
        long two = Math.abs((long) (divisor));
        boolean isfushu = !((dividend > 0 && divisor > 0) || (dividend < 0 && divisor < 0));

        long rr = 0;

        while (one >= two) {
            rr++;
            one -= two;
        }

        if (isfushu) {
            return (int) -rr;
        }
        return (int) rr;
    }
}

public class HW29 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.divide(10, 3));
        System.out.println(solution.divide(7, -3));
        System.out.println(solution.divide(-2147483648, -1));
    }
}
