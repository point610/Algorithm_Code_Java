package CodeTop.HW.HW0105;

/**
 * @ClassName HW0105
 * @Description TODO
 * @Author point
 * @Date 2023/12/29 10:16
 * @Version 1.0
 */
class Solution {
    public boolean oneEditAway(String first, String second) {
        int one = first.length();
        int two = second.length();
        int[][] dp = new int[one + 1][two + 1];

        for (int i = 0; i < one + 1; i++) {
            dp[i][0] = i;
        }
        for (int i = 0; i < two + 1; i++) {
            dp[0][i] = i;
        }

        for (int i = 1; i <= one; i++) {
            for (int j = 1; j <= two; j++) {
                if (first.charAt(i - 1) == second.charAt(j - 1)) {
                    dp[i][j] = Math.min(dp[i - 1][j - 1], Math.min(dp[i - 1][j], dp[i][j - 1]) + 1);
                } else {
                    dp[i][j] = Math.min(dp[i - 1][j - 1], Math.min(dp[i - 1][j], dp[i][j - 1])) + 1;
                }
            }
        }

        return dp[one][two] <= 1;
    }
}

public class HW0105 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.oneEditAway("pale", "ple"));
        System.out.println(solution.oneEditAway("pales", "pal"));

    }
}
