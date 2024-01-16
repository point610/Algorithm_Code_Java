package CodeTop.HW.HW1143;

/**
 * @ClassName HW1143
 * @Description TODO
 * @Author point
 * @Date 2023/12/27 17:28
 * @Version 1.0
 */
class Solution {
    public int longestCommonSubsequence(String text1, String text2) {

        int onesize = text1.length();
        int twosize = text2.length();

        int[][] dp = new int[onesize + 1][twosize + 1];

        for (int i = 1; i <= onesize; i++) {
            for (int j = 1; j <= twosize; j++) {
                char one = text1.charAt(i - 1);
                char two = text2.charAt(j - 1);

                if (one == two) {
                    dp[i][j] = Math.max(dp[i - 1][j - 1] + 1, Math.max(dp[i - 1][j], dp[i][j - 1]));
                } else {
                    dp[i][j] = Math.max(0, Math.max(dp[i - 1][j], dp[i][j - 1]));
                }
            }
        }
        return dp[onesize][twosize];
    }
}

public class HW1143 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.longestCommonSubsequence("abcde", "ace"));
        System.out.println(solution.longestCommonSubsequence("abc", "abc"));
        System.out.println(solution.longestCommonSubsequence("abc", "def"));
    }
}
