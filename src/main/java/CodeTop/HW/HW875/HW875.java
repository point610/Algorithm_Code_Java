package CodeTop.HW.HW875;

import java.util.*;

class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 0;
        int right = getMax(piles);
        while (left < right) {
            int mid = (left + right) / 2;
            if (check(mid, piles, h)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return right;
    }

    private boolean check(int mid, int[] piles, int h) {
        int count = 0;
        for (int iii : piles) {
            count += Math.ceil(iii * 1.0 / mid);
        }
        return count <= h;
    }

    private int getMax(int[] piles) {
        int max = 0;
        for (int iii : piles) {
            max = Math.max(max, iii);
        }
        return max;
    }
}

public class HW875 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.minEatingSpeed(new int[]{3, 6, 7, 11}, 8));
        System.out.println(solution.minEatingSpeed(new int[]{30, 11, 23, 4, 20}, 5));
        System.out.println(solution.minEatingSpeed(new int[]{30, 11, 23, 4, 20}, 6));
        System.out.println(solution.minEatingSpeed(new int[]{805306368, 805306368, 805306368}, 1000000000));
    }
}
