package CodeTop.HW.HW5;

/**
 * @ClassName HW5
 * @Description TODO
 * @Author point
 * @Date 2023/12/25 19:44
 * @Version 1.0
 */
class Solution {
    public String longestPalindrome(String s) {
        int size = s.length();
        for (int i = size; i >= 0; i--) {
            for (int j = 0; j + i <= size; j++) {
                if (ishuiwen(s.substring(j, i + j))) {
                    return s.substring(j, i + j);
                }
            }
        }
        return "";
    }

    private boolean ishuiwen(String one) {
        int size = one.length();
        for (int i = 0, j = size - 1; i < j; i++, j--) {
            if (one.charAt(i) != one.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}

public class HW5 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.longestPalindrome("abb"));
        System.out.println(solution.longestPalindrome("babad"));
        System.out.println(solution.longestPalindrome("cbbd"));
    }
}
