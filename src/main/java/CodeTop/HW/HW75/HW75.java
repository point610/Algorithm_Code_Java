package CodeTop.HW.HW75;

import java.util.Arrays;

/**
 * @ClassName HW75
 * @Description TODO
 * @Author point
 * @Date 2023/12/27 20:32
 * @Version 1.0
 */
class Solution {
    public void sortColors(int[] nums) {
        int size = nums.length;
        int zeroPoint = 0;
        int onePoint = 0;
        int twoPoint = 0;
        while (zeroPoint < size && nums[zeroPoint] == 0) {
            zeroPoint++;
        }
        if (zeroPoint == size) {
            return;
        }

        onePoint = zeroPoint;
        while (onePoint < size) {
            if (nums[onePoint] == 0) {
                int temp = nums[zeroPoint];
                nums[zeroPoint] = nums[onePoint];
                nums[onePoint] = temp;
                zeroPoint++;
            }
            onePoint++;
        }

        onePoint = zeroPoint;
        while (onePoint < size && nums[onePoint] == 1) {
            onePoint++;
        }
        if (onePoint == size) {
            return;
        }

        twoPoint = onePoint;
        while (twoPoint < size) {
            if (nums[twoPoint] == 1) {
                int temp = nums[onePoint];
                nums[onePoint] = nums[twoPoint];
                nums[twoPoint] = temp;
                onePoint++;
            }
            twoPoint++;
        }
        // System.out.println(nums);
    }
}

public class HW75 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.sortColors(new int[]{1, 2, 1});
        solution.sortColors(new int[]{2, 0, 2, 1, 1, 0});
        solution.sortColors(new int[]{2, 0, 1});
    }
}
