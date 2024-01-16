package LeetCode.Easy.LeetCode1572;

/**
 * @ClassName LeetCode1572
 * @Description TODO
 * @Author point
 * @Date 2023/8/11 1:32
 * @Version 1.0
 */
class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int size = mat.length;
        for (int i = 0; i < size; i++) {
            sum += mat[i][i] + mat[i][size - i - 1];
        }
        if (size % 2 == 1) {
            return sum - mat[size / 2][size / 2];
        }
        return sum;

    }
}

public class LeetCode1572 {
}
