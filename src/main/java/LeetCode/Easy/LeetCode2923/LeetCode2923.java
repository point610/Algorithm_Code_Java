package LeetCode.Easy.LeetCode2923;

/**
 * @ClassName LeetCode2923
 * @Description TODO
 * @Author point
 * @Date 2024/1/16 23:13
 * @Version 1.0
 */
class Solution {
    public int findChampion(int[][] grid) {

        int size = grid.length;
        for (int i = 0; i < size; i++) {
            boolean one = false;
            for (int j = 0; j < size; j++) {

                if (grid[j][i] == 1) {
                    one = true;
                }
            }

            if (!one) {
                return i;
            }
        }
        return 0;
    }
}

public class LeetCode2923 {
}
