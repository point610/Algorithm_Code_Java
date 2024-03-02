package CodeTop.HW2.HW680;

class Solution {
    public boolean validPalindrome(String s) {


        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return huiwen(s.substring(left, right)) || huiwen(s.substring(left + 1, right + 1));
            }
            left++;
            right--;
        }
        return true;
    }

    private boolean huiwen(String ss) {
        int left = 0;
        int right = ss.length() - 1;
        while (left < right) {
            if (ss.charAt(left) != ss.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

public class HW680 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.validPalindrome("aba"));
        System.out.println(solution.validPalindrome("abca"));
        System.out.println(solution.validPalindrome("abc"));
    }
}
