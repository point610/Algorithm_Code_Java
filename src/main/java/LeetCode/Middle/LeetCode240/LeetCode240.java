package LeetCode.Middle.LeetCode240;

/**
 * @ClassName LeetCode240
 * @Description TODO
 * @Author point
 * @Date 2023/11/19 22:40
 * @Version 1.0
 */
class Solution {

    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        int x = 0;
        int y = n - 1;
        while (0 <= y && x < m) {
            if (matrix[x][y] == target) {
                return true;
            }
            if (matrix[x][y] > target) {
                y--;
            } else {
                x++;
            }

        }


        return false;
    }
}

public class LeetCode240 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.searchMatrix(new int[][]{{1, 3, 5}}, 5));
    }
}
