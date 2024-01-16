package LeetCode.Easy.LeetCode680;

/**
 * @ClassName LeetCode680
 * @Description TODO
 * @Author point
 * @Date 2023/10/12 16:33
 * @Version 1.0
 */
class Solution {
    boolean once = true;

    public boolean validPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) == s.charAt(right)) {
                left++;
                right--;
            } else {
                if (once) {
                    once = false;
                    return validPalindrome(s.substring(left + 1, right + 1)) || validPalindrome(s.substring(left, right));
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}

public class LeetCode680 {
}
