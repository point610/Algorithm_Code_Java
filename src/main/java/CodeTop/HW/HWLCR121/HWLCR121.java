package CodeTop.HW.HWLCR121;

/**
 * @ClassName HWLCR121
 * @Description TODO
 * @Author point
 * @Date 2023/12/24 15:46
 * @Version 1.0
 */
class Solution {
    public boolean findTargetIn2DPlants(int[][] plants, int target) {

        int x = plants.length - 1;
        int y = 0;
        while (0 <= x && y < plants[0].length) {
            int temp = plants[x][y];
            if (temp == target) {
                return true;
            } else if (temp > target) {
                x--;
            } else {
                y++;
            }
        }
        return false;
    }
}

public class HWLCR121 {
}
