package CodeTop.HW.HW497;

import java.util.Random;

/**
 * @ClassName HW497
 * @Description TODO
 * @Author point
 * @Date 2023/12/31 20:53
 * @Version 1.0
 */
class Solution {
    int[][] rects;

    int[] sum;

    int size;

    Random random = new Random();

    public Solution(int[][] rects) {
        this.rects = rects;
        size = rects.length;
        sum = new int[size + 1];
        for (int i = 1; i <= size; i++) {
            sum[i] = sum[i - 1] + getArea(rects[i - 1]);
        }
    }

    private int getArea(int[] one) {
        return (one[2] - one[0] + 1) * (one[3] - one[1] + 1);
    }

    public int[] pick() {

        // 取得最大面积内的随机值
        int mmm = random.nextInt(sum[size]) + 1;

        int left = 0;
        int right = size;

        while (left < right) {
            int mid = (left + right) / 2;
            if (sum[mid] >= mmm) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        int[] area = rects[right - 1];
        int xm = area[2] - area[0] + 1;
        int ym = area[3] - area[1] + 1;

        return new int[]{random.nextInt(xm) + area[0], random.nextInt(ym) + area[1]};

    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(rects);
 * int[] param_1 = obj.pick();
 */
public class HW497 {
}
