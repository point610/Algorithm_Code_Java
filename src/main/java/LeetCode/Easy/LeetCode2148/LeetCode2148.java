package LeetCode.Easy.LeetCode2148;

import java.util.Arrays;

/**
 * @ClassName LeetCode2148
 * @Description TODO
 * @Author point
 * @Date 2023/9/30 18:04
 * @Version 1.0
 */
class Solution {
    public int countElements(int[] nums) {
        if (nums.length <= 2) {
            return 0;
        }
        Arrays.sort(nums);
        int size = nums.length;
        int left = 0;
        int right = size - 1;

        while (left < size && nums[0] == nums[left]) {
            left++;
        }
        if (left == size) {
            return 0;
        }
        while (nums[size - 1] == nums[right]) {
            right--;
        }
        return right - left + 1;

    }
}

public class LeetCode2148 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.countElements(new int[]{-3, 3, 3, 90}));
    }
}
