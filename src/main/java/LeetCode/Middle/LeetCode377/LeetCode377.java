package LeetCode.Middle.LeetCode377;

import java.util.Arrays;

class Solution {


    public int combinationSum4(int[] nums, int target) {
        int[] dp = new int[target + 1];
        Arrays.sort(nums);
        dp[0] = 1;
        for (int i = 1; i <= target; i++) {
            for (int num : nums) {
                if (i - num < 0) {
                    break;
                } else {
                    dp[i] += dp[i - num];
                }
            }
        }
        return dp[target];
    }

}

public class LeetCode377 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.combinationSum4(new int[]{1, 2, 3}, 4));
        System.out.println(solution.combinationSum4(new int[]{9}, 3));
    }
}
