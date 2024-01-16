package LeetCode.Middle.LeetCode74;

/**
 * @ClassName LeetCode74
 * @Description TODO
 * @Author point
 * @Date 2023/10/25 23:44
 * @Version 1.0
 */
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;
        if (target < matrix[0][0] || target > matrix[row - 1][col - 1]) {
            return false;
        }
        for (int i = 0; i < row; i++) {
            if (matrix[i][0] <= target && target <= matrix[i][col - 1]) {
                return erfenFind(matrix[i], target);
            }
        }
        return false;
    }

    private boolean erfenFind(int[] matrix, int target) {
        int left = 0;
        int right = matrix.length - 1;
        int mid = 0;
        while (left <= right) {
            mid = (left + right) / 2;
            if (matrix[mid] == target) {
                return true;
            }
            if (matrix[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }
}

public class LeetCode74 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.searchMatrix(new int[][]{{1}}, 1);
    }
}
