package CodeTop.HW2.HWLCR186;

import java.util.Arrays;

class Solution {
    public boolean checkDynasty(int[] places) {
        Arrays.sort(places);
        int zerocount = 0;
        int oneindex = 0;
        while (oneindex < places.length && places[oneindex] == 0) {
            zerocount++;
            oneindex++;
        }

        int sum = 0;
        for (int i = oneindex; i < places.length - 1; i++) {
            if (places[i + 1] == places[i]) {
                return false;
            }
            sum += places[i + 1] - places[i] - 1;
        }
        return zerocount >= sum;
    }
}

public class HWLCR186 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.checkDynasty(new int[]{0, 6, 9, 0, 7}));
        System.out.println(solution.checkDynasty(new int[]{7, 8, 9, 10, 11}));
    }
}
