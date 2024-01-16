package LeetCode.Easy.LCR068;

/**
 * @ClassName LCR068
 * @Description TODO
 * @Author point
 * @Date 2023/10/7 23:34
 * @Version 1.0
 */
class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int mid = (left + right) / 2;
        while (left <= right) {
            mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            }

        }
        return left;
    }
}

public class LCR068 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.searchInsert(new int[]{1}, 0));
    }
}
