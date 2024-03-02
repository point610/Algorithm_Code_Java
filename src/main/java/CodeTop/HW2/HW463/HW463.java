package CodeTop.HW2.HW463;

class Solution {
    private int row;
    private int col;

    private boolean in(int x, int y) {
        return 0 <= x && x < row && 0 <= y && y < col;
    }

    public int islandPerimeter(int[][] grid) {
        int edge = 0;
        int number = 0;
        row = grid.length;
        col = grid[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == 1) {
                    number++;

                    if (in(i - 1, j) && grid[i - 1][j] == 1) {
                        edge++;
                    }
                    if (in(i, j - 1) && grid[i][j - 1] == 1) {
                        edge++;
                    }
                    if (in(i + 1, j) && grid[i + 1][j] == 1) {
                        edge++;
                    }
                    if (in(i , j+ 1) && grid[i ][j+ 1] == 1) {
                        edge++;
                    }


                }
            }
        }
        return number * 4 - edge;
    }
}

public class HW463 {
}
