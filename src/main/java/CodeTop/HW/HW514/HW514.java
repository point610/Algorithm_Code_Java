package CodeTop.HW.HW514;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int findRotateSteps(String ring, String key) {

        // dp[i][j] 表示从前往后拼写出 key的第 i 个字符，
        // ring 的第 j 个字符与 12:00 方向对齐的最少步数（下标均从 0 开始）。
        int n = ring.length(), m = key.length();
        // 每个字符维护一个位置数组 pos[i]，表示字符 i 在 ring 中出现的位置集合，用来加速计算转移的过程。
        List<Integer>[] pos = new List[26];
        for (int i = 0; i < 26; ++i) {
            pos[i] = new ArrayList<>();
        }
        for (int i = 0; i < n; ++i) {
            pos[ring.charAt(i) - 'a'].add(i);
        }
        // 初始化dp
        // dp的第一行表示对于key的第一个字符，ring中，距离该字符的旋转距离
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; ++i) {
            Arrays.fill(dp[i], 0x3f3f3f);
        }

        // 第一个字符的初始化
        for (int i : pos[key.charAt(0) - 'a']) {
            dp[0][i] = Math.min(i, n - i) + 1;
        }

        for (int i = 1; i < m; ++i) {
            for (int j : pos[key.charAt(i) - 'a']) {
                for (int k : pos[key.charAt(i - 1) - 'a']) {
                    dp[i][j] = Math.min(dp[i][j], dp[i - 1][k] + Math.min(Math.abs(j - k), n - Math.abs(j - k)) + 1);
                }
            }
        }

        return Arrays.stream(dp[m - 1]).min().getAsInt();
    }
}


public class HW514 {
}
