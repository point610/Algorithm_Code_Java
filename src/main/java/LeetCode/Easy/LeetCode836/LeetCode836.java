package LeetCode.Easy.LeetCode836;

/**
 * @ClassName LeetCode836
 * @Description TODO
 * @Author point
 * @Date 2023/8/12 12:38
 * @Version 1.0
 */
class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        int x1 = rec1[0];
        int x2 = rec1[2];
        int y1 = rec1[1];
        int y2 = rec1[3];

        int x3 = rec2[0];
        int x4 = rec2[2];
        int y3 = rec2[1];
        int y4 = rec2[3];
        if (x1 >= x4 || x2 <= x3 || y1 >= y4 || y2 <= y3) {
            return false;
        }

        return true;
    }
}

public class LeetCode836 {
}
