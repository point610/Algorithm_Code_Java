package LeetCode.Easy.LeetCode495;

/**
 * @ClassName LeetCode495
 * @Description TODO
 * @Author point
 * @Date 2023/8/3 21:55
 * @Version 1.0
 */
class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int size = timeSeries.length;

        int sum = size * duration;

        for (int i = 0; i < size - 1; i++) {
            int temp = timeSeries[i + 1] - timeSeries[i];
            if (temp < duration) {
                sum += temp - duration;
            }
        }
        return sum;

    }
}

public class LeetCode495 {
}
