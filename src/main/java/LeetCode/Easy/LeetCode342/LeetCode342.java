package LeetCode.Easy.LeetCode342;

/**
 * @ClassName LeetCode342
 * @Description TODO
 * @Author point
 * @Date 2023/7/13 23:27
 * @Version 1.0
 */
class Solution {
    public boolean isPowerOfFour(int n) {
        long sum = 1;
        while (true) {
            if (sum == n) {
                return true;
            } else if (sum > n) {
                return false;
            } else {
                sum *= 4;
            }
        }
    }
}

public class LeetCode342 {
}
