package LeetCode.Middle.LeetCode413;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int size = nums.length;
        if (size < 3) {
            return 0;
        }

        int[] temp = new int[size - 1];
        for (int i = 0; i < size - 1; i++) {
            temp[i] = nums[i + 1] - nums[i];
        }

        int sum = 1;
        int res = 0;
        for (int i = 1; i < temp.length; i++) {
            if (temp[i] == temp[i - 1]) {
                sum++;
            } else {
                if (sum >= 2) {
                    res += getone(sum);
                }
                sum = 1;
            }
        }

        if (sum >= 2) {

            res += getone(sum);
        }

        return res;
    }

    private int getone(int sum) {
        sum--;
        return (sum + 1) * sum / 2;
    }
}

public class LeetCode413 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.numberOfArithmeticSlices(new int[]{1, 2, 3}));
        System.out.println(solution.numberOfArithmeticSlices(new int[]{1, 2, 3, 4}));
        System.out.println(solution.numberOfArithmeticSlices(new int[]{1}));
    }
}
