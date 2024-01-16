package LeetCode.Easy.LeetCode766;

/**
 * @ClassName LeetCode766
 * @Description TODO
 * @Author point
 * @Date 2023/8/11 16:49
 * @Version 1.0
 */
class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int row = matrix.length;
        int column = matrix[0].length;
        if (row == 1 && column == 1) {
            return true;
        }

        for (int i = 0; i < row - 1; i++) {
            int temp = matrix[i][0];
            int rIndex = i;
            int cIndex = 0;
            while (rIndex < row && cIndex < column) {
                if (matrix[rIndex][cIndex] != temp) {
                    return false;
                }
                rIndex++;
                cIndex++;
            }
        }

        for (int i = 1; i < column; i++) {
            int temp = matrix[0][i];
            int rIndex = 0;
            int cIndex = i;
            while (rIndex < row && cIndex < column) {
                if (matrix[rIndex][cIndex] != temp) {
                    return false;
                }
                rIndex++;
                cIndex++;
            }
        }
        return true;
    }
}

public class LeetCode766 {
}
