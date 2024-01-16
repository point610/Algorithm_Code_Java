package CodeTop.HW.HW263;

import java.math.BigInteger;

/**
 * @ClassName HW263
 * @Description TODO
 * @Author point
 * @Date 2023/12/24 19:31
 * @Version 1.0
 */
class Solution {
    public boolean isUgly(int n) {
        if (n == 0) {
            return false;
        }
        while (true) {
            if (n == 1) {
                return true;
            }
            if (n % 2 == 0) {
                n /= 2;
            } else if (n % 3 == 0) {
                n /= 3;
            } else if (n % 5 == 0) {
                n /= 5;
            } else {
                return false;
            }
        }
    }
}

public class HW263 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isUgly(6));
        System.out.println(solution.isUgly(1));
        System.out.println(solution.isUgly(14));
    }
}
