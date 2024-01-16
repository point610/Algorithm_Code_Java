package LeetCode.Easy.LeetCode1502;

import java.util.Arrays;

/**
 * @ClassName LeetCode1502
 * @Description TODO
 * @Author point
 * @Date 2023/9/27 16:16
 * @Version 1.0
 */
class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int step = arr[1] - arr[0];
        int size = arr.length;
        for (int i = 1; i < size - 1; i++) {
            if (arr[i + 1] - arr[i] != step) {
                return false;
            }
        }
        return true;
    }
}

public class LeetCode1502 {
}
