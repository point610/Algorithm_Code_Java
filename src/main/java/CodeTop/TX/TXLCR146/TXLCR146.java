package CodeTop.TX.TXLCR146;

import java.util.Arrays;

class Solution {
    public int[] spiralArray(int[][] array) {
        if (array == null) {
            return new int[]{};
        }

        int row = array.length;
        if (row == 0) {
            return new int[]{};
        }
        int col = array[0].length;
        int size = row * col;

        int[] res = new int[size];
        int index = 0;

        int x = 0;
        int y = 0;
        int offset = 0;
        while (index < size) {
            while (y < (col - offset)) {
                res[index++] = array[x][y++];
            }
            y--;
            x++;
            if (index >= size) {
                break;
            }

            while (x < (row - offset)) {
                res[index++] = array[x++][y];
            }
            x--;
            y--;
            if (index >= size) {
                break;
            }

            while ((offset) <= y) {
                res[index++] = array[x][y--];
            }
            y++;
            x--;
            if (index >= size) {
                break;
            }

            offset++;
            while ((offset) <= x) {
                res[index++] = array[x--][y];
            }
            x++;
            y++;
        }

        return res;
    }
}

public class TXLCR146 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.spiralArray(new int[][]{{1, 2, 3}, {8, 9, 4}, {7, 6, 5}})));
        System.out.println(Arrays.toString(solution.spiralArray(new int[][]{{1, 2, 3, 4}, {12, 13, 14, 5}, {11, 16, 15, 6}, {10, 9, 8, 7}})));
    }
}
