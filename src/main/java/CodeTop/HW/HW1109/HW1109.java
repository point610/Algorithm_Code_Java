package CodeTop.HW.HW1109;

import java.util.Arrays;

/**
 * @ClassName HW1109
 * @Description TODO
 * @Author point
 * @Date 2023/12/30 16:36
 * @Version 1.0
 */
class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {

        int[] list = new int[n];

        for (int[] iii : bookings) {
            int left = iii[0] - 1;
            int right = iii[1] - 1;

            int temp = iii[2];
            list[left] += temp;
            if (right + 1 < n) {
                list[right + 1] -= temp;
            }

        }

        for (int i = 1; i < n; i++) {
            list[i] += list[i - 1];
        }
        return list;

    }
}

public class HW1109 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.corpFlightBookings(new int[][]{{1, 2, 10}, {2, 3, 20}, {2, 5, 25}}, 5)));
    }
}
