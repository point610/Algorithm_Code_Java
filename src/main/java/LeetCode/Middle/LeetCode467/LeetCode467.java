package LeetCode.Middle.LeetCode467;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
class Solution {
    public int findSubstringInWraproundString(String p) {
        int[] dp = new int[26];
        int k = 0;
        for (int i = 0; i < p.length(); ++i) {
            if (i > 0 && (p.charAt(i) - p.charAt(i - 1) + 26) % 26 == 1) { // 字符之差为 1 或 -25
                ++k;
            } else {
                k = 1;
            }
            dp[p.charAt(i) - 'a'] = Math.max(dp[p.charAt(i) - 'a'], k);
        }
        return Arrays.stream(dp).sum();
    }
}

public class LeetCode467 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.findSubstringInWraproundString("a"));
        System.out.println(solution.findSubstringInWraproundString("cac"));
        System.out.println(solution.findSubstringInWraproundString("zab"));
        System.out.println(solution.findSubstringInWraproundString("zaba"));
    }
}
