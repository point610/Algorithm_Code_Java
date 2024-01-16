package CodeTop.HW.HW713;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName HW713
 * @Description TODO
 * @Author point
 * @Date 2023/12/29 19:35
 * @Version 1.0
 */
class Solution {


    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int count = 0;

        int size = nums.length;
        for (int i = 0; i < size; i++) {
            int sum = 1;
            for (int j = i; j < size; j++) {
                sum *= nums[j];
                if (sum < k) {
                    count++;
                } else {
                    break;
                }
            }
        }

        return count;
    }
}

public class HW713 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.numSubarrayProductLessThanK(new int[]{10, 9, 10, 4, 3, 8, 3, 3, 6, 2, 10, 10, 9, 3}, 19));
        System.out.println(solution.numSubarrayProductLessThanK(new int[]{10, 5, 2, 6}, 100));
        System.out.println(solution.numSubarrayProductLessThanK(new int[]{1, 2, 3}, 1));
    }
}
