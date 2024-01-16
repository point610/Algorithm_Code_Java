package LeetCode.Easy.LeetCode1486;

/**
 * @ClassName LeetCode1486
 * @Description TODO
 * @Author point
 * @Date 2023/9/27 16:03
 * @Version 1.0
 */
class Solution {
    public int xorOperation(int n, int start) {
        int res = start;
        for (int i = 1; i < n; i++) {
            res ^= start + 2 * i;
        }
        return res;

    }
}

public class LeetCode1486 {
}
