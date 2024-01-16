package LeetCode.Middle.LeetCode931;

/**
 * @ClassName LeetCode931
 * @Description TODO
 * @Author point
 * @Date 2023/7/13 23:09
 * @Version 1.0
 */
class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int size = matrix.length;
        for (int i = 1; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (j == 0) {
                    matrix[i][j] = Math.min(matrix[i][j] + matrix[i - 1][j], matrix[i][j] + matrix[i - 1][j + 1]);
                } else if (j == size - 1) {
                    matrix[i][j] = Math.min(matrix[i][j] + matrix[i - 1][j], matrix[i][j] + matrix[i - 1][j - 1]);
                } else {
                    matrix[i][j] = Math.min(Math.min(matrix[i][j] + matrix[i - 1][j], matrix[i][j] + matrix[i - 1][j - 1]), matrix[i][j] + matrix[i - 1][j + 1]);
                }
            }
        }
        int sum = 100000;
        for (int i = 0; i < size; i++) {
            if (sum > matrix[size - 1][i]) {
                sum = matrix[size - 1][i];
            }
        }
        return sum;
    }
}

public class LeetCode931 {
    public static void main(String[] args) {

        Solution solution = new Solution();
        System.out.println(solution.minFallingPathSum(new int[][]{{-19, 57}, {-40, -5}}));
    }
}
