package LeetCode.Middle.LeetCode162;

/**
 * @ClassName LeetCode162
 * @Description TODO
 * @Author point
 * @Date 2023/11/11 23:47
 * @Version 1.0
 */
class Solution {
    public int findPeakElement(int[] nums) {
        if (nums.length == 1) {
            return 0;
        }
        if (nums.length == 2) {
            return nums[0] > nums[1] ? 0 : 1;
        }
        int left = 0;
        int right = nums.length - 1;
        int mid;
        while (left <= right) {
            mid = (left + right) / 2;
            if (mid == 0) {
                return nums[mid] > nums[mid + 1] ? mid : mid + 1;
            }
            if (mid == nums.length - 1) {
                return nums[mid] > nums[mid - 1] ? mid : mid - 1;
            }
            if (nums[mid - 1] < nums[mid] && nums[mid] > nums[mid + 1]) {
                return mid;
            }
            if (nums[mid + 1] > nums[mid]) {
                left = mid + 1;
            } else if (nums[mid - 1] > nums[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }

        }
        return 0;
    }
}

public class LeetCode162 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.findPeakElement(new int[]{3, 1, 2});
    }
}
