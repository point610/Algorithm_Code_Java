package CodeTop.TX.TX153;

class Solution {
    public int findMin(int[] nums) {
        int size = nums.length;
        int left = 0;
        int right = size - 1;
        while (left < right) {
            int mid = (left + right) / 2;

            if (nums[left] <= nums[mid] && nums[mid] <= nums[right]) {
                right = mid - 1;
            } else if (nums[left] <= nums[mid] && nums[right] <= nums[left]) {
                left = mid + 1;
            } else if (nums[right] <= nums[left] && nums[mid] <= nums[right]) {
                right = mid;
            }
        }
        return nums[left];
    }
}

public class TX153 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.findMin(new int[]{3, 4, 5, 1, 2}));
        System.out.println(solution.findMin(new int[]{4, 5, 6, 7, 0, 1, 2}));
        System.out.println(solution.findMin(new int[]{11, 13, 15, 17}));
    }
}
