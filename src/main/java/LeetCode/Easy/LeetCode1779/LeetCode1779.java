package LeetCode.Easy.LeetCode1779;

/**
 * @ClassName LeetCode1779
 * @Description TODO
 * @Author point
 * @Date 2023/9/28 18:28
 * @Version 1.0
 */
class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int size = points.length;
        int min = Integer.MAX_VALUE;
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (x == points[i][0] || y == points[i][1]) {
                // 有效
                int dist = Math.abs(x - points[i][0]) + Math.abs(y - points[i][1]);
                if (dist < min) {
                    min = dist;
                    index = i;
                }

            }
        }
        return index;
    }
}

public class LeetCode1779 {
}
