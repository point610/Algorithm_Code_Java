package CodeTop.HW.HW416;

/**
 * @ClassName HW416
 * @Description TODO
 * @Author point
 * @Date 2023/12/27 16:23
 * @Version 1.0
 */
class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        int max = 0;
        for (int ii : nums) {
            max = Math.max(max, ii);
            sum += ii;
        }
        if (sum % 2 == 1 || sum / 2 < max) {
            return false;
        }
        int target = sum / 2;
        if (target == max) {
            return true;
        }
        int size = nums.length;
        boolean[][] dp = new boolean[size][target + 1];
        for (int i = 0; i < size; i++) {
            dp[i][0] = true;
        }

        for (int i = 0; i < size; i++) {

            for (int j = 1; j <= target; j++) {

                // 不使用当前数字的情况
                if (i >= 1) {
                    dp[i][j] = dp[i - 1][j];
                }

                // 当前数字为需要的数字目标，直接为true
                if (nums[i] == j) {
                    dp[i][j] = true;
                    continue;
                }

                // 使用当前数字的情况
                if (i >= 1 && j - nums[i] > 0) {

                    dp[i][j] = dp[i - 1][j] || dp[i - 1][j - nums[i]];
                }
            }
        }

        return dp[size - 1][target];
    }
}

public class HW416 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.canPartition(new int[]{2, 2, 3, 5}));
        System.out.println(solution.canPartition(new int[]{1, 5, 11, 5}));
        System.out.println(solution.canPartition(new int[]{1, 2, 3, 5}));
    }
}
