package LeetCode.Easy.LeetCode704;

/**
 * @ClassName LeetCode704
 * @Description TODO
 * @Author point
 * @Date 2023/8/10 18:15
 * @Version 1.0
 */
class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int mid = (left + right) / 2;
        while (left <= right) {
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] > target) {
                right = mid - 1;
                mid = (left + right) / 2;
            } else {
                left = mid + 1;
                mid = (left + right) / 2;
            }
        }
        return -1;
    }
}

public class LeetCode704 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.search(new int[]{5}, 5));
    }
}
