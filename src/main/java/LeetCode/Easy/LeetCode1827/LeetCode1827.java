package LeetCode.Easy.LeetCode1827;

/**
 * @ClassName LeetCode1827
 * @Description TODO
 * @Author point
 * @Date 2023/9/29 0:27
 * @Version 1.0
 */
class Solution {
    public int minOperations(int[] nums) {
        int sum = 0;
        int size = nums.length;
        for (int i = 1; i < size; i++) {
            if (nums[i - 1] < nums[i]) {
                continue;
            }
            int temp = nums[i - 1] + 1;
            sum += temp - nums[i];
            nums[i] = temp;

        }
        return sum;
    }
}

public class LeetCode1827 {
}
