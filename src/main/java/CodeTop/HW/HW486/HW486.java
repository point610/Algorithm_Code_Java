package CodeTop.HW.HW486;

class Solution {
    public boolean predictTheWinner(int[] nums) {

        int size = nums.length;
        //dp[i][j]表示当前的user的对手净胜user多少分
        int[][] dp = new int[size][size];
        for (int i = 0; i < size; i++) {
            dp[i][i] = nums[i];
        }

        for (int i = size - 2; i >= 0; i--) {
            for (int j = i + 1; j < size; j++) {
                //dp[i + 1][j]和dp[i][j - 1]表示当前的user的对手净胜user多少分
                dp[i][j] = Math.max(nums[i] - dp[i + 1][j], nums[j] - dp[i][j - 1]);
            }
        }

        return dp[0][size - 1] >= 0;
    }
}

public class HW486 {
}
