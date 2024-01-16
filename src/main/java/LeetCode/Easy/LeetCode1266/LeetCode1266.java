package LeetCode.Easy.LeetCode1266;

/**
 * @ClassName LeetCode1266
 * @Description TODO
 * @Author point
 * @Date 2023/9/13 10:29
 * @Version 1.0
 */

class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int size = points.length;
        int count = 0;
        for (int i = 0; i < size - 1; i++) {
            int x = Math.abs(points[i][0] - points[i + 1][0]);
            int y = Math.abs(points[i][1] - points[i + 1][1]);
            int min = Math.min(x, y);
            int max = Math.max(x, y);
            count += min;
            count += max - min;
        }
        return count;

    }
}

public class LeetCode1266 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.minTimeToVisitAllPoints(new int[][]{{3,2},{-2,2}}));
    }
}
