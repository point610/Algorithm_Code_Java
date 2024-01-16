package CodeTop.HW.HW74;

/**
 * @ClassName HW74
 * @Description TODO
 * @Author point
 * @Date 2023/12/30 21:43
 * @Version 1.0
 */
class Solution {
    int row;

    int col;

    boolean in(int x, int y) {
        return 0 <= x && x < row && 0 <= y && y < col;
    }

    public boolean searchMatrix(int[][] matrix, int target) {
         row = matrix.length;
         col = matrix[0].length;

        int x = row - 1;
        int y = 0;

        while (in(x, y)) {
            if (matrix[x][y] == target) {
                return true;
            } else if (matrix[x][y] < target) {
                y++;
            } else {
                x--;
            }
        }
        return false;
    }
}

public class HW74 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.searchMatrix(new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}}, 3));
    }
}
