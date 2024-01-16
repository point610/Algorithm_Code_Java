package LeetCode.Middle.LeetCode371;

/**
 * @ClassName LeetCode371
 * @Description TODO
 * @Author point
 * @Date 2023/10/10 17:07
 * @Version 1.0
 */
class Solution {
    public int getSum(int a, int b) {
        while (b != 0) {
            int c = (a & b) << 1;
            a = (a ^ b);
            b = c;
        }
        return a;
    }
}

public class LeetCode371 {
}
