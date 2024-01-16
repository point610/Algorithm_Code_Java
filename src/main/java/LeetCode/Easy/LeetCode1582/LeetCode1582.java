package LeetCode.Easy.LeetCode1582;

/**
 * @ClassName LeetCode1582
 * @Description TODO
 * @Author point
 * @Date 2023/8/11 13:22
 * @Version 1.0
 */
class Solution {
    public int numSpecial(int[][] mat) {
        int res = 0;
        int row = mat.length;
        int column = mat[0].length;
        int[] rowOne = new int[row];
        int[] columnOne = new int[column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (mat[i][j] == 1) {
                    rowOne[i]++;
                }
            }
        }
        for (int i = 0; i < column; i++) {
            for (int j = 0; j < row; j++) {
                if (mat[j][i] == 1) {
                    columnOne[i]++;
                }
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (mat[i][j] == 1 && rowOne[i] == 1 && columnOne[j] == 1) {
                    res++;
                }
            }
        }


        return res;
    }
}

public class LeetCode1582 {
}
