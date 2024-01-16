package LeetCode.Hard.LeetCode10;

/**
 * @ClassName LeetCode10
 * @Description TODO
 * @Author point
 * @Date 2023/12/19 20:08
 * @Version 1.0
 */
class Solution {
    public boolean isMatch(String s, String p) {
        int row = s.length();
        int col = p.length();
        boolean[][] dp = new boolean[row + 1][col + 1];
        dp[0][0] = true;
        for (int i = 0; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                if (p.charAt(j - 1) == '*') {
                    // j 需要-1 ，*匹配的是对应位置p 前的一个词
                    if (match(s, p, i, j - 1)) {
                        // dp[i][j - 2]为不匹配
                        // dp[i - 1][j]为匹配s 中的一个字符
                        dp[i][j] = dp[i][j - 2] || dp[i - 1][j];
                    } else {
                        // 不匹配
                        dp[i][j] = dp[i][j - 2];
                    }
                } else if (match(s, p, i, j)) {
                    // p中为. 或者p 和s 中相应位置的相同
                    dp[i][j] = dp[i - 1][j - 1];
                }

            }
        }
        return dp[row][col];
    }

    // p中对应位置为.
    // p 和s 对应位置相等
    private boolean match(String s, String p, int i, int j) {
        if (i == 0) {
            return false;
        }

        if (p.charAt(j - 1) == '.') {
            return true;
        }
        return p.charAt(j - 1) == s.charAt(i - 1);
    }
}

public class LeetCode10 {
}
