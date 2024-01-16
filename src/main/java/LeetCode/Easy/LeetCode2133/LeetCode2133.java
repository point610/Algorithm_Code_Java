package LeetCode.Easy.LeetCode2133;

/**
 * @ClassName LeetCode2133
 * @Description TODO
 * @Author point
 * @Date 2023/9/30 22:38
 * @Version 1.0
 */
class Solution {
    boolean checkrow(int[] arr, int n) {
        int[] times = new int[n];
        for (int i = 0; i < n; i++) {
            times[arr[i] - 1]++;
        }
        for (int i = 0; i < n; i++) {
            if (times[i] != 1) {
                return false;
            }
        }
        return true;
    }

    boolean checkcolumn(int[][] arr, int n, int index) {
        int[] times = new int[n];
        for (int i = 0; i < n; i++) {
            times[arr[i][index] - 1]++;
        }
        for (int i = 0; i < n; i++) {
            if (times[i] != 1) {
                return false;
            }
        }
        return true;
    }

    public boolean checkValid(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            if (!checkrow(matrix[i], n)) {
                return false;
            }
        }
        for (int i = 0; i < n; i++) {
            if (!checkcolumn(matrix, n, i)) {
                return false;
            }
        }
        return true;

    }
}

public class LeetCode2133 {
}
