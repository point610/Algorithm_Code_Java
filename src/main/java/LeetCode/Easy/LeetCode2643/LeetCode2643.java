package LeetCode.Easy.LeetCode2643;

/**
 * @ClassName LeetCode2643
 * @Description TODO
 * @Author point
 * @Date 2023/10/3 12:32
 * @Version 1.0
 */
class Solution {
    int getone(int[] arr) {
        int size = arr.length;
        int one = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] == 1) {
                one++;
            }
        }
        return one;
    }

    public int[] rowAndMaximumOnes(int[][] mat) {
        int hang = 0;
        int maxone = 0;
        int row = mat.length;

        for (int i = 0; i < row; i++) {
            int temp = getone(mat[i]);
            if (temp > maxone) {
                hang = i;
                maxone = temp;
            }

        }

        return new int[]{hang, maxone};
    }
}

public class LeetCode2643 {
}
