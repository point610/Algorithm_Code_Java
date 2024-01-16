package CodeTop.HW.HW45;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @ClassName HW45
 * @Description TODO
 * @Author point
 * @Date 2023/12/26 10:08
 * @Version 1.0
 */
class Solution {
    public int jump(int[] nums) {
        int size = nums.length;
        for (int i = 0, j = size - 1; i < j; i++, j--) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        int[] dp = new int[size];
        Arrays.fill(dp, 100000);
        dp[0] = 0;
        for (int i = 1; i < size; i++) {
            int step = nums[i];
            int end = Math.max(0, i - step);
            for (int j = i - 1; j >= end; j--) {
                dp[i] = Math.min(dp[i], dp[j] + 1);
            }
        }
        return dp[size - 1];
    }
}

public class HW45 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.jump(new int[]{2, 3, 1, 1, 4}));
        System.out.println(solution.jump(new int[]{2, 3, 0, 1, 4}));
    }
}
