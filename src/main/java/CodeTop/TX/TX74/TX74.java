package CodeTop.TX.TX74;

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;
        int x = row - 1;
        int y = 0;

        while (0 <= x && y < col - 1) {
            if (matrix[x][y] == target) {
                return true;
            }
            if (matrix[x][y] > target) {
                x--;
            } else {
                y++;
            }
        }
        return false;
    }
}

public class TX74 {
}
