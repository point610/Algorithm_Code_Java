package CodeTop.HW.HW516;

class Solution {
    public int longestPalindromeSubseq(String s) {
        int size = s.length();
        int[][] dp = new int[size][size];
        for (int i = size - 1; i >= 0; i--) {
            dp[i][i] = 1;
            for (int j = i + 1; j < size; j++) {
                char one = s.charAt(i);
                char two = s.charAt(j);
                if (one == two) {
                    dp[i][j] = dp[i + 1][j - 1] + 2;
                } else {
                    dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
                }
            }
        }

        return dp[0][size - 1];
    }
}

public class HW516 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.longestPalindromeSubseq("bbbab"));
        System.out.println(solution.longestPalindromeSubseq("cbbd"));
    }
}
