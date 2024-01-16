package LeetCode.Easy.MS.MS1001;

import java.util.Arrays;

/**
 * @ClassName MS1001
 * @Description TODO
 * @Author point
 * @Date 2023/10/12 12:01
 * @Version 1.0
 */
class Solution {
    public void merge(int[] A, int m, int[] B, int n) {
        for (int i = m; i < m + n; i++) {
            A[i] = B[i - m];
        }
        Arrays.sort(A);
    }
}

public class MS1001 {
}
