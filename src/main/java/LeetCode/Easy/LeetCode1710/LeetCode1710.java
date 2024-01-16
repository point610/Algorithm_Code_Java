package LeetCode.Easy.LeetCode1710;

import java.util.Arrays;

/**
 * @ClassName LeetCode1710
 * @Description TODO
 * @Author point
 * @Date 2023/9/28 16:18
 * @Version 1.0
 */
class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {

        Arrays.sort(boxTypes, (o1, o2) -> {
            return o2[1] - o1[1];
        });
        int res = 0;
        int size = boxTypes.length;
        for (int i = 0; i < size; i++) {

            int number = Math.min(truckSize, boxTypes[i][0]);
            res += number * boxTypes[i][1];
            truckSize -= number;

            if (truckSize == 0) {
                break;
            }
        }
        return res;

    }
}

public class LeetCode1710 {
}
