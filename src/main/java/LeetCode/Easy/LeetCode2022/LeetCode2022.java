package LeetCode.Easy.LeetCode2022;

/**
 * @ClassName LeetCode2022
 * @Description TODO
 * @Author point
 * @Date 2023/9/30 1:19
 * @Version 1.0
 */
class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        if (m * n != original.length) {
            return new int[0][0];
        }
        int[][] arr = new int[m][n];
        int index = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = original[index++];
            }
        }
        return arr;
    }
}

public class LeetCode2022 {
}
