package CodeTop.HW.HW48;

/**
 * @ClassName HW48
 * @Description TODO
 * @Author point
 * @Date 2023/12/29 21:21
 * @Version 1.0
 */
class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int[][] list = new int[n][n];

        int index = 0;

        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j >= 0; j--) {
                list[index / n][index % n] = matrix[j][i];
                index++;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = list[i][j];
            }
        }
    }
}

public class HW48 {
}
