package LeetCode.Easy.LeetCode1688;

/**
 * @ClassName LeetCode1688
 * @Description TODO
 * @Author point
 * @Date 2023/9/28 14:46
 * @Version 1.0
 */
class Solution {
    public int numberOfMatches(int n) {
        int times = 0;
        while (n != 1) {
            if (n % 2 == 0) {
                times += n / 2;
                n = n / 2;
            } else {
                times += (n - 1) / 2;
                n = (n - 1) / 2 + 1;
            }
        }
        return times;
    }
}

public class LeetCode1688 {
}
