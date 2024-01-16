package CodeTop.HW.HW704;

/**
 * @ClassName HW704
 * @Description TODO
 * @Author point
 * @Date 2023/12/23 20:32
 * @Version 1.0
 */
class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }

        }
        return -1;
    }
}

public class HW704 {
}
