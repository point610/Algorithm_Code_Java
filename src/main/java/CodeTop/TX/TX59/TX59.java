package CodeTop.TX.TX59;

class Solution {
    public int[][] generateMatrix(int n) {
        int size = n * n;
        int[][] list = new int[n][n];
        int temp = 0;
        int x = 0;
        int y = 0;
        int offset = 0;
        while (temp != size) {
            while (y < n - offset) {
                list[x][y] = temp++ + 1;
                y++;
            }
            y--;
            x++;
            if (temp == size) {
                break;
            }

            while (x < n - offset) {
                list[x][y] = temp++ + 1;
                x++;
            }
            x--;
            y--;
            if (temp == size) {
                break;
            }

            while (offset <= y) {
                list[x][y] = temp++ + 1;
                y--;
            }
            y++;
            x--;
            if (temp == size) {
                break;
            }

            offset++;
            while (offset <= x) {
                list[x][y] = temp++ + 1;
                x--;
            }
            x++;
            y++;

        }
        return list;
    }
}

public class TX59 {
}
