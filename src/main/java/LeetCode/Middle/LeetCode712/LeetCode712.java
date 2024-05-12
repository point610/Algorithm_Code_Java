package LeetCode.Middle.LeetCode712;

class Solution {
    public int minimumDeleteSum(String s1, String s2) {

        // 动态规划
        // dp[i][j] 表示 s1[0:i] 和 s2[0:j] 的最小删除和
        // 如果 s1[i] == s2[j] 则 dp[i][j] = dp[i-1][j-1]
        int[][] dp = new int[s1.length() + 1][s2.length() + 1];

        for (int i = 1; i <= s1.length(); i++) {
            dp[i][0] = dp[i - 1][0] + s1.charAt(i - 1);
        }
        for (int j = 1; j <= s2.length(); j++) {
            dp[0][j] = dp[0][j - 1] + s2.charAt(j - 1);
        }

        for (int i = 1; i <= s1.length(); i++) {
            for (int j = 1; j <= s2.length(); j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.min(dp[i - 1][j] + s1.charAt(i - 1), dp[i][j - 1] + s2.charAt(j - 1));
                }
            }
        }

        return dp[s1.length()][s2.length()];
    }
}

public class LeetCode712 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.minimumDeleteSum("sea", "eat"));
        System.out.println(solution.minimumDeleteSum("delete", "leet"));
    }
}
