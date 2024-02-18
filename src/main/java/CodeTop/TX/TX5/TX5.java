package CodeTop.TX.TX5;

class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.isEmpty()) {
            return "";
        }
        int size = s.length();
        int start = 0;
        int end = 0;
        for (int i = 0; i < size; i++) {
            int one = gethuiwen(s, i, i);
            int two = gethuiwen(s, i, i + 1);

            if (one >= two) {
                if (one > end - start) {
                    start = i - (one - 1) / 2;
                    end = i + (one - 1) / 2;
                }
            } else {
                if (two > end - start) {
                    start = i - (two - 2) / 2;
                    end = i + 1 + (two - 2) / 2;
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

public class TX5 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.longestPalindrome("babad"));
        System.out.println(solution.longestPalindrome("cbbd"));
    }
}
