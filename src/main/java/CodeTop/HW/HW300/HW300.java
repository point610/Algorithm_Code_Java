package CodeTop.HW.HW300;

import java.util.Arrays;

/**
 * @ClassName HW300
 * @Description TODO
 * @Author point
 * @Date 2023/12/27 16:14
 * @Version 1.0
 */
class Solution {
    public int lengthOfLIS(int[] nums) {
        int size = nums.length;
        int[] dp = new int[size];
        Arrays.fill(dp, 1);
        int max = 1;
        for (int i = 1; i < size; i++) {

            for (int j = i - 1; j >= 0; j--) {
                if (nums[j] < nums[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                    max = Math.max(max, dp[i]);
                }
            }

        }
        return max;
    }
}

public class HW300 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.lengthOfLIS(new int[]{1, 3, 6, 7, 9, 4, 10, 5, 6}));
        System.out.println(solution.lengthOfLIS(new int[]{10, 9, 2, 5, 3, 7, 101, 18}));
        System.out.println(solution.lengthOfLIS(new int[]{0, 1, 0, 3, 2, 3}));
        System.out.println(solution.lengthOfLIS(new int[]{7, 7, 7, 7, 7, 7, 7}));
    }
}
