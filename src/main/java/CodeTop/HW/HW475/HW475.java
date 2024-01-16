package CodeTop.HW.HW475;

import java.util.Arrays;

/**
 * @ClassName HW475
 * @Description TODO
 * @Author point
 * @Date 2023/12/23 16:44
 * @Version 1.0
 */
class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        int radius = 0;
        int oneindex = 0;
        int twoindex = 0;
        Arrays.sort(houses);
        Arrays.sort(heaters);

        for (int i = 0; i < houses.length; i++) {

            // 找到最近的heaters
            while (twoindex < heaters.length && heaters[twoindex] < houses[i]) {
                twoindex++;
            }
            int temp = 0;
            if (twoindex == 0) {
                temp = Math.abs(heaters[0] - houses[i]);
            } else if (twoindex == heaters.length) {
                temp = Math.abs(heaters[heaters.length - 1] - houses[i]);
            } else {
                temp = Math.min(Math.abs(heaters[twoindex - 1] - houses[i]), Math.abs(heaters[twoindex] - houses[i]));
            }
            radius = Math.max(radius, temp);

        }
        return radius;
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
