package CodeTop.TX.TX482;

class Solution {
    public String licenseKeyFormatting(String s, int k) {
        int size = s.length();
        StringBuilder stringBuilder = new StringBuilder();
        int times = 0;
        for (int i = size - 1; i >= 0; i--) {
            if (s.charAt(i) == '-') {
                continue;
            }
            stringBuilder.append(Character.isLowerCase(s.charAt(i)) ? Character.toUpperCase(s.charAt(i)) : s.charAt(i));
            times++;

            if (times == k && i != 0) {
                times = 0;
                stringBuilder.append('-');
            }
        }
        if (stringBuilder.length() >= 1 && stringBuilder.charAt(stringBuilder.length() - 1) == '-') {
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        }
        return stringBuilder.reverse().toString();
    }
}

public class TX482 {
    public static void main(String[] args) {
        Solution
                solution = new Solution();
        System.out.println(solution.licenseKeyFormatting("5F3Z-2e-9-w", 4));
        System.out.println(solution.licenseKeyFormatting("2-5g-3-J", 2));
        System.out.println(solution.licenseKeyFormatting("--a-a-a-a--", 2));
    }
}
