package LeetCode.Middle.LeetCode300;

/**
 * @ClassName LeetCode300
 * @Description TODO
 * @Author point
 * @Date 2023/11/24 21:41
 * @Version 1.0
 */
class Solution {
    public int lengthOfLIS(int[] nums) {
        int size = nums.length;
        int[] dp = new int[size];
        int max = 1;
        for (int i = 0; i < size; i++) {
            dp[i] = 1;
        }
        for (int i = 0; i < size; i++) {
            if (i == 0) {
                dp[i] = 1;
                continue;
            }
            for (int j = i - 1; j >= 0; j--) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                    max = Math.max(max, dp[i]);
                }
            }
        }
        return max;
    }
}

public class LeetCode300 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.lengthOfLIS(new int[]{7,7,7,7,7,7,7}));
    }
}
