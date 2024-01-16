package LeetCode.Easy.LCR012;

/**
 * @ClassName LCR012
 * @Description TODO
 * @Author point
 * @Date 2023/10/7 21:12
 * @Version 1.0
 */
class Solution {

    public int pivotIndex(int[] nums) {
        int size = nums.length;
        if (size == 1) {
            return 0;
        }

        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += nums[i];
        }
        int left = 0;
        for (int i = 0; i < size; i++) {
            if (i >= 1) {
                left += nums[i - 1];
            }
            sum -= nums[i];
            if (left == sum) {
                return i;
            }
        }

        return -1;
    }
}

public class LCR012 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.pivotIndex(new int[]{2, 1, -1}));
    }
}
