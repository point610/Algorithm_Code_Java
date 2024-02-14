package CodeTop.TX.TX125;

class Solution {
    public boolean isPalindrome(String s) {
        int size = s.length();
        int left = 0;
        int right = size - 1;

        while (left < right) {
            if (!Character.isUpperCase(s.charAt(left)) && !Character.isLowerCase(s.charAt(left)) && !Character.isDigit(s.charAt(left))) {
                left++;
                continue;
            }
            if (!Character.isUpperCase(s.charAt(right)) && !Character.isLowerCase(s.charAt(right)) && !Character.isDigit(s.charAt(right))) {
                right--;
                continue;
            }
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

public class TX125 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(solution.isPalindrome("race a car"));
        System.out.println(solution.isPalindrome(" "));
        System.out.println(solution.isPalindrome("0P"));
    }
}
