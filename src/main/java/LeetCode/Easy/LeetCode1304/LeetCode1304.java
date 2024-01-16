package LeetCode.Easy.LeetCode1304;

/**
 * @ClassName LeetCode1304
 * @Description TODO
 * @Author point
 * @Date 2023/9/17 9:13
 * @Version 1.0
 */

class Solution {
    public int[] sumZero(int n) {
        int[] res = new int[n];
        int times = n / 2;
        int index = 0;
        if (n % 2 == 0) {
            for (int i = 1; i <= times; i++) {
                res[index++] = i;
                res[index++] = -i;
            }
        } else {
            res[index++] = 0;
            for (int i = 1; i <= times; i++) {
                res[index++] = i;
                res[index++] = -i;
            }
        }
        return res;
    }
}

public class LeetCode1304 {
}
