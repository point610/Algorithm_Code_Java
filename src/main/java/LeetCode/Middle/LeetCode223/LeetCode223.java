package LeetCode.Middle.LeetCode223;

class Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int one = computeArea(ax1, ay1, ax2, ay2);
        int two = computeArea(bx1, by1, bx2, by2);

        if (iscover(ax1, ay1, ax2, ay2, bx1, by1, bx2, by2)) {
            return one + two - computeArea(Math.max(ax1, bx1), Math.max(ay1, by1), Math.min(ax2, bx2), Math.min(ay2, by2));
        } else {
            return one + two;
        }

    }

    private boolean iscover(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        // 判断两个矩形是否重叠
        return !(ax2 <= bx1 || ax1 >= bx2 || ay2 <= by1 || ay1 >= by2);
    }

    private int computeArea(int ax1, int ay1, int ax2, int ay2) {
        return (ax2 - ax1) * (ay2 - ay1);

    }
}

public class LeetCode223 {
}
