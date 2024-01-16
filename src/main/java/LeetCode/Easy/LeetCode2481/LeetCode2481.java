package LeetCode.Easy.LeetCode2481;

/**
 * @ClassName LeetCode2481
 * @Description TODO
 * @Author point
 * @Date 2023/10/2 12:16
 * @Version 1.0
 */
class Solution {
    public int numberOfCuts(int n) {
        if (n == 1) {
            return 0;
        }
        if (n % 2 == 0) {
            return n / 2;
        }
        return n;

    }
}

public class LeetCode2481 {
}
