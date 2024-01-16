package LeetCode.Easy.LeetCode1184;

/**
 * @ClassName LeetCode1184
 * @Description TODO
 * @Author point
 * @Date 2023/8/18 20:54
 * @Version 1.0
 */
class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int size = distance.length;
        int sum = 0;
        int dis = 0;
        int max = Math.max(start, destination);
        int min = Math.min(start, destination);
        start = min;
        destination = max;
        for (int i = 0; i < size; i++) {
            sum += distance[i];
            if (start <= i && i < destination) {
                dis += distance[i];
            }
        }
        return Math.min(dis, sum - dis);

    }
}

public class LeetCode1184 {
}
