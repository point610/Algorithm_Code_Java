package LeetCode.Easy.LeetCode2778;

/**
 * @ClassName LeetCode2778
 * @Description TODO
 * @Author point
 * @Date 2023/10/4 13:51
 * @Version 1.0
 */
class Solution {
    public int sumOfSquares(int[] nums) {
        int size = nums.length;
        int sum = 0;
        for (int i = 1; i <= size; i++) {
            if (size % i == 0) {
                sum += nums[i - 1] * nums[i - 1];
            }
        }
        return sum;
    }
}

public class LeetCode2778 {
}
