package CodeTop.HW2.HWLCR146;
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

public class HWLCR146 {
}
