package CodeTop.TX.TX240;

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int row = matrix.length;
        int col = matrix[0].length;

        int x = 0;
        int y = col - 1;

        while (x < row && 0 <= y) {
            if (matrix[x][y] == target) {
                return true;
            }
            if (matrix[x][y] < target) {
                x++;
            } else {
                y--;
            }
        }

        return false;
    }
}

public class TX240 {
}
