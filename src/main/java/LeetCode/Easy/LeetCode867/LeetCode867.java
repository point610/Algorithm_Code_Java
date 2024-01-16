package LeetCode.Easy.LeetCode867;

/**
 * @ClassName LeetCode867
 * @Description TODO
 * @Author point
 * @Date 2023/8/12 0:57
 * @Version 1.0
 */
class Solution {
    public int[][] transpose(int[][] matrix) {
        int row = matrix.length;
        int column = matrix[0].length;
        int[][] res = new int[column][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                res[j][i] = matrix[i][j];
            }
        }
        return res;
    }
}

public class LeetCode867 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.transpose(new int[][]{
                {1,2,3},{4,5,6},{7,8,9}
        });
    }
}
