package LeetCode.Middle.LeetCode452;

import java.util.*;

class Solution {
    public int findMinArrowShots(int[][] points) {
        int[] temp = new int[3];
        Arrays.sort(points, Comparator.comparingInt(o -> o[0]));
        int sum = 0;

        for (int i = 1; i < points.length; i++) {
            if (points[i - 1][1] < points[i][0]) {
                sum++;
            } else {
                // 更新right
                points[i][1] = Math.min(points[i - 1][1], points[i][1]); // 更新重叠区间的右边界
            }
        }
        sum++;

        return sum;
    }
}

public class LeetCode452 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.findMinArrowShots(new int[][]{{-2147483646, -2147483645}, {2147483646, 2147483647}}));
        System.out.println(solution.findMinArrowShots(new int[][]{{10, 16}, {2, 8}, {1, 6}, {7, 12}}));
        System.out.println(solution.findMinArrowShots(new int[][]{{1, 2}, {3, 4}, {5, 6}, {7, 8}}));
        System.out.println(solution.findMinArrowShots(new int[][]{{1, 2}, {2, 3}, {3, 4}, {4, 5}}));

    }
}
