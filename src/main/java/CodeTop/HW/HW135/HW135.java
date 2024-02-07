package CodeTop.HW.HW135;

import java.util.Arrays;

class Solution {
    public int candy(int[] ratings) {
        int size = ratings.length;
        int[] left = new int[size];
        int[] right = new int[size];
        Arrays.fill(left, 1);
        Arrays.fill(right, 1);
        // left
        for (int i = 1; i < size; i++) {
            if (ratings[i - 1] < ratings[i]) {
                left[i] = left[i - 1] + 1;
            }
        }
        for (int i = size - 1; i >= 1; i--) {
            if (ratings[i - 1] > ratings[i]) {
                right[i - 1] = right[i] + 1;
            }
        }
        int count = 0;
        for (int i = 0; i < size; i++) {
            count += Math.max(left[i], right[i]);
        }
        return count;
    }
}

public class HW135 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.candy(new int[]{1, 3, 2, 2, 1}));
        System.out.println(solution.candy(new int[]{1, 0, 2}));
        System.out.println(solution.candy(new int[]{1, 2, 2}));
    }
}
