package CodeTop.HW2.HW5;

class Solution {
    public String longestPalindrome(String s) {
        int size = s.length();
        int start = 0;
        int end = 0;

        for (int i = 0; i < size; i++) {
            int one = gethuiwen(s, i, i);
            int two = gethuiwen(s, i, i + 1);
            if (one >= two) {
                if (one > (end - start)) {
                    start = i - one / 2;
                    end = i + one / 2;
                }
            } else {
                if (two > (end - start)) {
                    start = i - two / 2 + 1;
                    end = i + two / 2;
                }
            }
        }

        return s.substring(start, end + 1);
    }

    private int gethuiwen(String s, int left, int right) {
        while (0 <= left && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }
}

public class HW5 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.longestPalindrome("babad"));
        System.out.println(solution.longestPalindrome("cbbd"));
    }
}
