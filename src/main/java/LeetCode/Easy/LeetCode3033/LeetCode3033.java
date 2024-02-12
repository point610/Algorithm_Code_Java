package LeetCode.Easy.LeetCode3033;

    class Solution {
        public int[][] modifiedMatrix(int[][] matrix) {
            int size = matrix[0].length;
            int[] max = new int[size];
            int row = matrix.length;
            int col = matrix[0].length;
            for (int i = 0; i < col; i++) {
                for (int j = 0; j < row; j++) {
                    max[i] = Math.max(max[i], matrix[j][i]);
                }
            }

            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    if (matrix[i][j] == -1) {
                        matrix[i][j] = max[j];
                    }
                }
            }
            return matrix;
        }
    }

public class LeetCode3033 {
}
