package JavaGuide.dtgh.dtgh516;

class Solution {
    public int longestPalindromeSubseq(String s) {
        int size = s.length();
        int[][] dp = new int[size][size];

        for (int i = size - 1; i >= 0; i--) {
            dp[i][i] = 1;
            for (int j = i + 1; j < size; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    // 从中间向两边扩散
                    dp[i][j] = dp[i + 1][j - 1] + 2;
                } else {
                    // 从中间的一边取一个
                    dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[0][size - 1];
    }
}

public class dtgh516 {
}
