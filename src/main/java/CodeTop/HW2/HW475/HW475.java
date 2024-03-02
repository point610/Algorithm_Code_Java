package CodeTop.HW2.HW475;

import java.util.Arrays;

class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        int oneindex = 0;

        Arrays.sort(houses);
        Arrays.sort(heaters);

        int res = 0;
        for (int i = 0; i < houses.length; i++) {

            while (oneindex < heaters.length && heaters[oneindex] < houses[i]) {
                oneindex++;
            }

            int temp = 0;
            if (oneindex == 0) {
                // 加热的第一个
                temp = Math.abs(heaters[oneindex] - houses[i]);
            } else if (oneindex == heaters.length) {
                // 加热的最后一个
                temp = Math.abs(heaters[oneindex - 1] - houses[i]);
                // 不能直接跳出循环，house还没有走完
            } else {
                temp = Math.min(Math.abs(heaters[oneindex - 1] - houses[i]), Math.abs(heaters[oneindex] - houses[i]));
            }
            res = Math.max(res, temp);
        }
        return res;
    }
}

public class HW475 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.findRadius(new int[]{1, 2, 3}, new int[]{2}));
        System.out.println(solution.findRadius(new int[]{1, 2, 3, 4}, new int[]{1, 4}));
        System.out.println(solution.findRadius(new int[]{1, 5}, new int[]{2}));
    }
}
