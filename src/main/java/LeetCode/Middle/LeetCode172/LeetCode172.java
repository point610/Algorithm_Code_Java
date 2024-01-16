package LeetCode.Middle.LeetCode172;

/**
 * @ClassName LeetCode172
 * @Description TODO
 * @Author point
 * @Date 2023/11/12 23:28
 * @Version 1.0
 */
class Solution {
    public int trailingZeroes(int n) {
        int sum = 0;
        while (n >= 5) {
            n /= 5;
            sum += n;
        }
        return sum;
    }
}

public class LeetCode172 {
}
