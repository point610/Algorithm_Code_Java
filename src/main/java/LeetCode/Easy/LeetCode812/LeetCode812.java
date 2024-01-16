package LeetCode.Easy.LeetCode812;

/**
 * @ClassName LeetCode812
 * @Description TODO
 * @Author point
 * @Date 2023/8/11 18:19
 * @Version 1.0
 */
class Solution {
    public double largestTriangleArea(int[][] points) {
        int size = points.length;
        double res = 0;
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                for (int k = j + 1; k < size; k++) {
                    res = Math.max(res, Area(points[i][0], points[i][1], points[j][0], points[j][1], points[k][0], points[k][1]));

                }
            }
        }
        return res;
    }

    private double Area(int x1, int x2, int y1, int y2, int z1, int z2) {
        return 0.5 * Math.abs(x1 * y2 + x2 * z1 + y1 * z2 - z1 * y2 - x2 * y1 - z2 * x1);

    }

}

public class LeetCode812 {
}
