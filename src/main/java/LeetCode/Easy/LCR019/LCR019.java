package LeetCode.Easy.LCR019;

/**
 * @ClassName LCR019
 * @Description TODO
 * @Author point
 * @Date 2023/10/7 21:26
 * @Version 1.0
 */
class Solution {

    boolean ishuiwen(String s, int left, int right, boolean can) {
        while (left < right) {
            if (s.charAt(left) == s.charAt(right)) {
                left++;
                right--;
            } else {
                if (!can) {
                    return false;
                } else {
                    return ishuiwen(s, left, right - 1, false) || ishuiwen(s, left + 1, right, false);
                }
            }
        }
        return true;
    }

    public boolean validPalindrome(String s) {
        return ishuiwen(s, 0, s.length() - 1, true);
    }
}

public class LCR019 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.validPalindrome("abc"));
    }
}
