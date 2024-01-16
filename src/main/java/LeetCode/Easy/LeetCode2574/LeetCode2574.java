package LeetCode.Easy.LeetCode2574;

/**
 * @ClassName LeetCode2574
 * @Description TODO
 * @Author point
 * @Date 2023/10/1 11:09
 * @Version 1.0
 */
class Solution {
    public int[] leftRightDifference(int[] nums) {
        int size = nums.length;
        int[] left = new int[size];
        int[] right = new int[size];
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += nums[i];
        }

        for (int i = 0; i < size; i++) {
            if (i == 0) {
                left[i] = 0;
            } else {
                left[i] = nums[i - 1] + left[i - 1];
            }
            right[i] = sum - left[i] - nums[i];
        }
        for (int i = 0; i < size; i++) {
            left[i] = Math.abs(left[i] - right[i]);
        }
        return left;
    }
}

public class LeetCode2574 {
    public static void main(String[] args) {

        Solution solution = new Solution();
        solution.leftRightDifference(new int[]{10, 4, 8, 3});
    }
}
