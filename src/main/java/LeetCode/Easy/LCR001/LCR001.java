package LeetCode.Easy.LCR001;

/**
 * @ClassName LCR001
 * @Description TODO
 * @Author point
 * @Date 2023/10/5 13:29
 * @Version 1.0
 */
class Solution {
    public int divide(int a, int b) {
        if (a == 0) {
            return 0;
        }
        if (b == 1) {
            return a;
        }
        if (b == -1) {
            if (a == -2147483648) {
                return 2147483647;
            }
            return -a;
        }
        if (a == -2147483648) {
            if (b == -2147483648) {
                return 1;
            }
            int times = 1;
            boolean fuzhu = b > 0;
            b = Math.abs(b);
            a += b;
            while (Math.abs(a) >= b) {
                times++;
                a += b;
            }
            if (fuzhu) {
                return -times;
            }
            return times;
        }
        if (b == -2147483648) {
            return 0;
        }

        boolean fuzhu = (a < 0 && b > 0) || (b < 0 && a > 0);
        a = Math.abs(a);
        b = Math.abs(b);
        if (a < b) {
            return 0;
        }
        int times = 0;
        while (a >= b) {
            times++;
            a -= b;
        }
        if (fuzhu) {
            return -times;
        }
        return times;
    }
}

public class LCR001 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.divide(-2147483648, 2));
    }
}
