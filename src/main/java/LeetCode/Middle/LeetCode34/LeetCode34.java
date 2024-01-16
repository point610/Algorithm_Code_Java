package LeetCode.Middle.LeetCode34;

/**
 * @ClassName LeetCode34
 * @Description TODO
 * @Author point
 * @Date 2023/8/29 21:01
 * @Version 1.0
 */
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int index = getIndex(nums, target);
        if (index == -1) {
            return new int[]{-1, -1};
        }

        int size = nums.length;

        int left = index;
        int right = index;
        while (0 < left && nums[left] == target) {
            left--;
        }
        if (nums[left] != target) {
            left++;
        }
        while (right < size - 1 && nums[right] == target) {
            right++;
        }
        if (nums[right] != target) {
            right--;
        }
        return new int[]{left, right};

    }

    int getIndex(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int mid;
        while (left <= right) {
            mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}

public class LeetCode34 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.searchRange(new int[]{}, 0);
    }
}
