package LeetCode.Easy.LeetCode1637;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @ClassName LeetCode1637
 * @Description TODO
 * @Author point
 * @Date 2024/1/16 22:49
 * @Version 1.0
 */
class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {

        Arrays.sort(points, Comparator.comparingInt(o -> o[0]));

        int max = 0;
        for (int i = 0; i < points.length-1; i++) {
            max = Math.max(max, points[i + 1][0] - points[i][0]);
        }

        return max;


    }
}

public class LeetCode1637 {
}
