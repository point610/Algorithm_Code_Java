package CodeTop.HW.HW16;

import java.util.Arrays;

/**
 * @ClassName HW16
 * @Description TODO
 * @Author point
 * @Date 2023/12/27 17:05
 * @Version 1.0
 */
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int min = Integer.MAX_VALUE;
        int res = 0;
        int size = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < size - 2; i++) {
            int left = i + 1;
            int right = size - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == target) {
                    return sum;
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
                if (min > Math.abs(target - sum)) {
                    min = Math.abs(target - sum);
                    res = sum;
                }
            }
        }
        return res;
    }
}

public class HW16 {
    public static void main(String[] args) {
        Solution
                solution = new Solution();
        System.out.println(solution.threeSumClosest(new int[]{-1, 2, 1, -4}, 1));
        System.out.println(solution.threeSumClosest(new int[]{0, 0, 0}, 1));
    }
}
