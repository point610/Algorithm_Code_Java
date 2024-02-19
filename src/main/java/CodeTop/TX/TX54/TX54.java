package CodeTop.TX.TX54;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int x = 0;
        int y = 0;

        int row = matrix.length;
        int col = matrix[0].length;

        int size = row * col;

        int offset = 0;

        while (true) {

            while (y < col - offset) {
                list.add(matrix[x][y]);
                y++;
            }
            y--;
            x++;
            if (list.size() == size) {
                break;
            }

            while (x < row - offset) {
                list.add(matrix[x][y]);
                x++;
            }
            x--;
            y--;
            if (list.size() == size) {
                break;
            }

            while (offset <= y) {
                list.add(matrix[x][y]);
                y--;
            }
            y++;
            x--;
            if (list.size() == size) {
                break;
            }

            offset++;
            while (offset <= x) {
                list.add(matrix[x][y]);
                x--;
            }
            x++;
            y++;
            if (list.size() == size) {
                break;
            }
        }

        return list;
    }
}

public class TX54 {
}
