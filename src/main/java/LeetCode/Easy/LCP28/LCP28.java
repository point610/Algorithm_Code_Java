package LeetCode.Easy.LCP28;

import java.util.Arrays;

/**
 * @ClassName LCP28
 * @Description TODO
 * @Author point
 * @Date 2023/9/21 23:53
 * @Version 1.0
 */
class Solution {
    public int purchasePlans(int[] nums, int target) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        int res = 0;
        while (left < right) {
            if (nums[left] + nums[right] > target) {
                right--;
            } else {
                res = (res + (right - left)) % 1000000007;
                left++;
            }
        }
        return res;
    }
}

public class LCP28 {
}
