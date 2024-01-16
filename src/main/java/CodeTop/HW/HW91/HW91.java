package CodeTop.HW.HW91;

/**
 * @ClassName HW91
 * @Description TODO
 * @Author point
 * @Date 2023/12/28 15:22
 * @Version 1.0
 */
class Solution {
    public int numDecodings(String s) {
        int size = s.length();

        int[] dp = new int[size];

        for (int i = 0; i < size; i++) {
            if (i == 0) {
                int current = s.charAt(i) - '0';
                if (current == 0) {
                    return 0;
                }
                dp[i] = 1;
                continue;
            }

            int current = s.charAt(i) - '0';
            int pre = s.charAt(i - 1) - '0';
            pre = pre * 10 + current;
            if (1 <= current && current <= 9) {
                dp[i] = dp[i - 1];
            }
            if (10 <= pre && pre <= 26) {
                if (i - 2 < 0) {
                    dp[i]++;
                } else {
                    dp[i] += dp[i - 2];
                }
            }

        }

        return dp[size - 1];
    }
}

public class HW91 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.numDecodings("12"));
        System.out.println(solution.numDecodings("226"));
        System.out.println(solution.numDecodings("06"));
    }
}
