package LeetCode.Easy.LeetCode2319;

/**
 * @ClassName LeetCode2319
 * @Description TODO
 * @Author point
 * @Date 2023/10/1 13:08
 * @Version 1.0
 */
class Solution {
    public boolean checkXMatrix(int[][] grid) {
        int size = grid.length;
        int tempindex = size - 1;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (j == i || j == tempindex) {
                    if (grid[i][j] == 0) {
                        return false;
                    }
                    if (j == tempindex) {
                        tempindex--;
                    }
                } else {
                    if (grid[i][j] != 0) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}

public class LeetCode2319 {
}
