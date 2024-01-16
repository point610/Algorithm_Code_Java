package LeetCode.Easy.LeetCode1317;

/**
 * @ClassName LeetCode1317
 * @Description TODO
 * @Author point
 * @Date 2023/9/17 10:05
 * @Version 1.0
 */
class Solution {
    static boolean has0(int n) {
        String temp = String.valueOf(n);
        return temp.indexOf('0') != -1;
    }

    public int[] getNoZeroIntegers(int n) {
        int size = n / 2 + 1;
        for (int i = 1; i < size; i++) {
            if (has0(i) || has0(n - i)) {
                continue;
            }
            return new int[]{i, n - i};

        }
return  new int[]{0, 0};
    }
}

public class LeetCode1317 {
}
