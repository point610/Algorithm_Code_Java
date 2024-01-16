package LeetCode.Easy.LeetCode2037;

import java.util.Arrays;

/**
 * @ClassName LeetCode2037
 * @Description TODO
 * @Author point
 * @Date 2023/9/30 10:36
 * @Version 1.0
 */
class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int sum = 0;
        int size = seats.length;
        for (int i = 0; i < size; i++) {
            sum += Math.abs(seats[i] - students[i]);
        }
        return sum;
    }
}

public class LeetCode2037 {
}
