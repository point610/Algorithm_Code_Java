package LeetCode.Middle.LeetCode2679;

import java.util.Arrays;

/**
 * @ClassName LeetCode2679
 * @Description TODO
 * @Author point
 * @Date 2023/8/12 0:06
 * @Version 1.0
 */
class Solution {
    public int matrixSum(int[][] nums) {
        int row = nums.length;
        int column = nums[0].length;

        for (int i = 0; i < row; i++) {
            Arrays.sort(nums[i]);

        }
        int res = 0;
        for (int i = 0; i < column; i++) {
            int max = 0;
            for (int j = 0; j < row; j++) {
                max = Math.max(max, nums[j][i]);
            }
            res += max;
        }

        return res;
    }
}

public class LeetCode2679 {
}
