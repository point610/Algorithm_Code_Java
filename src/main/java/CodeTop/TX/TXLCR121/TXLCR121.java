package CodeTop.TX.TXLCR121;

class Solution {
    public boolean findTargetIn2DPlants(int[][] plants, int target) {
        if (plants == null) {
            return false;
        }

        int row = plants.length;
        if (row == 0) {
            return false;
        }
        int col = plants[0].length;


        int x = row - 1;
        int y = 0;
        while (0 <= x && y < col) {
            int temp = plants[x][y];
            if (temp == target) {
                return true;
            }
            if (temp < target) {
                y++;
            } else {
                x--;
            }
        }
        return false;
    }
}

public class TXLCR121 {
}
