package LeetCode.Easy.LeetCode1252;

/**
 * @ClassName LeetCode1252
 * @Description TODO
 * @Author point
 * @Date 2023/9/13 10:40
 * @Version 1.0
 */
class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] list = new int[m][n];
        int size = indices.length;
        for (int i = 0; i < size; i++) {
            int x = indices[i][0];
            int y = indices[i][1];
            for (int j = 0; j < n; j++) {
                list[x][j]++;
            }
            for (int j = 0; j < m; j++) {
                list[j][y]++;
            }
        }
        int res = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (list[i][j] % 2 == 1) {
                    res++;
                }
            }
        }
        return res;
    }
}

public class LeetCode1252 {
}
