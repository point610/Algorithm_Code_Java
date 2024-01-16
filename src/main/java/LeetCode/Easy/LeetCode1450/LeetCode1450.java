package LeetCode.Easy.LeetCode1450;

/**
 * @ClassName LeetCode1450
 * @Description TODO
 * @Author point
 * @Date 2023/9/27 0:37
 * @Version 1.0
 */
class Solution {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int size = startTime.length;
        int res = 0;
        for (int i = 0; i < size; i++) {
            if (startTime[i] <= queryTime && queryTime <= endTime[i]) {
                res++;
            }
        }
        return res;
    }
}

public class LeetCode1450 {
}
