package LeetCode.Easy.LeetCode977;

/**
 * @ClassName LeetCode977
 * @Description TODO
 * @Author point
 * @Date 2023/8/15 23:40
 * @Version 1.0
 */
class Solution {
    public int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        int[] res = new int[right + 1];
        int index = right;
        while (left <= right) {
            if (Math.abs(nums[left]) <= Math.abs(nums[right])) {
                res[index] = nums[right] * nums[right];
                index--;
                right--;
            } else {
                res[index] = nums[left] * nums[left];
                index--;
                left++;
            }
        }
        return res;
    }
}

public class LeetCode977 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.sortedSquares(new int[]{-7,-3,2,3,11});
    }
}
