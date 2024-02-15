package LeetCode.Hard.LeetCode154;

class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (nums[mid] < nums[right]) {
                right = mid;
            } else if (nums[right] < nums[mid]) {
                left = mid + 1;
            } else {
                // 相等的情况
                right--;
            }
        }
        return nums[left];
    }
}

public class LeetCode154 {
}
