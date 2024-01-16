package LeetCode.Easy.LCP55;

/**
 * @ClassName LCP55
 * @Description TODO
 * @Author point
 * @Date 2023/9/26 9:47
 * @Version 1.0
 */
class Solution {
    public int getMinimumTime(int[] time, int[][] fruits, int limit) {
        int res = 0;
        int size = fruits.length;
        for (int i = 0; i < size; i++) {
            int type = fruits[i][0];
            int number = fruits[i][1];
            int times = (int) Math.ceil(number*1.0 / limit);
            res += time[type] * times;

        }
        return res;
    }
}

public class LCP55 {
}
