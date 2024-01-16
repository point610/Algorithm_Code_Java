package LeetCode.Easy.LCP02;

import java.util.Arrays;

/**
 * @ClassName LCP02
 * @Description TODO
 * @Author point
 * @Date 2023/9/20 22:47
 * @Version 1.0
 */
class Solution {
    public int[] fraction(int[] cont) {
        int size = cont.length;
        int n = 1;
        int m = cont[size - 1];
        for (int i = size - 2; i >= 0; i--) {
            int temp = m;
            m = cont[i] * m + n;
            n = temp;
        }
        return new int[]{m, n};
    }
}

public class LCP02 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.fraction(new int[]{3, 2, 0, 2})));
    }
}
