package CodeTop.HW.HW497;

import java.util.Random;


class Solution {
    Random random = new Random();
    int[] sum;
    int all;
    int[][] rects;

    private int getArea(int[] aaa) {
        return (aaa[2] - aaa[0] + 1) * (1 + aaa[3] - aaa[1]);
    }

    public Solution(int[][] rects) {
        this.rects = rects;
        int size = rects.length;
        sum = new int[size];
        for (int i = 0; i < size; i++) {
            sum[i] = getArea(rects[i]);
            all += sum[i];
        }
    }

    public int[] pick() {
        int iiii = random.nextInt(all);
        int index = 0;
        for (int i = 0; i < sum.length; i++) {
            if (iiii < sum[index]) {
                break;
            }
            iiii -= sum[i];
            index++;
        }

        int lx = rects[index][0];
        int ly = rects[index][1];
        int rx = rects[index][2];
        int ry = rects[index][3];

        return new int[]{lx + random.nextInt(rx - lx + 1), ly + random.nextInt(ry - ly + 1)};

    }
}


public class HW497 {
}
