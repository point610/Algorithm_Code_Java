package LeetCode.Easy.LCR146;

/**
 * @ClassName LCR146
 * @Description TODO
 * @Author point
 * @Date 2023/10/9 12:00
 * @Version 1.0
 */
class Solution {
    int row;

    int column;

    boolean in(int x, int y) {
        return 0 <= x && x < row && 0 <= y && y < column;
    }

    public int[] spiralArray(int[][] array) {
        if (array == null) {
            return new int[0];
        }
        this.row = array.length;
        if (row == 0) {
            return new int[0];
        }
        this.column = array[0].length;
        int sum = row * column;
        boolean[][] temp = new boolean[row][column];
        int size = 0;
        int x = 0;
        int y = 0;
        int[] res = new int[sum];
        while (size != sum) {
            // right
            while (in(x, y) && !temp[x][y]) {
                res[size++] = array[x][y];
                temp[x][y] = true;
                y++;
            }
            y--;
            x++;
            // down
            while (in(x, y) && !temp[x][y]) {
                res[size++] = array[x][y];
                temp[x][y] = true;
                x++;
            }
            x--;
            y--;
            // left
            while (in(x, y) && !temp[x][y]) {
                res[size++] = array[x][y];
                temp[x][y] = true;
                y--;
            }
            y++;
            x--;
            // up
            while (in(x, y) && !temp[x][y]) {
                res[size++] = array[x][y];
                temp[x][y] = true;
                x--;
            }
            x++;
            y++;
        }
        return res;
    }
}

public class LCR146 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.spiralArray(
                new int[][]{
                        {1, 2, 3}, {4, 5, 6}, {7, 8, 9}
                }
        );
    }
}
