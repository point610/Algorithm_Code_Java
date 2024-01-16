package LeetCode.Easy.LeetCode409;

/**
 * @ClassName LeetCode409
 * @Description TODO
 * @Author point
 * @Date 2023/7/16 0:28
 * @Version 1.0
 */
class Solution {
    int[] big = new int[26];
    int[] small = new int[26];

    public int longestPalindrome(String s) {
        int size = s.length();
        for (int i = 0; i < size; i++) {
            if (s.charAt(i) >= 'a') {
                small[s.charAt(i) - 'a'] = small[s.charAt(i) - 'a'] + 1;
            } else {
                big[s.charAt(i) - 'A'] = big[(s.charAt(i) - 'A')] + 1;
            }
        }
        int sum = 0;
        int jishu = 0;
        for (int i = 0; i < 26; i++) {
            sum += small[i] / 2 * 2;
            if (small[i] % 2 == 1) {
                jishu = 1;
            }
        }
        for (int i = 0; i < 26; i++) {
            sum += big[i] / 2 * 2;
            if (big[i] % 2 == 1) {
                jishu = 1;
            }
        }
        return sum + jishu;
    }
}

public class LeetCode409 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.longestPalindrome("AB"));
    }
}
