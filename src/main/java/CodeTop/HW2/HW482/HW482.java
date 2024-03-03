package CodeTop.HW2.HW482;

class Solution {
    public String licenseKeyFormatting(String s, int k) {
        s = s.replaceAll("-", "");
        StringBuilder stringBuilder = new StringBuilder();

        int index = s.length() - 1;
        while (0 <= index) {
            for (int i = 0; 0 <= index && i < k; i++) {
                if (Character.isLowerCase(s.charAt(index))) {
                    stringBuilder.insert(0, Character.toUpperCase(s.charAt(index)));
                } else {
                    stringBuilder.insert(0, s.charAt(index));
                }
                index--;
            }
            if (index >= 0) {
                stringBuilder.insert(0, '-');
            }
        }
        return stringBuilder.toString();
    }
}

public class HW482 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.licenseKeyFormatting("5F3Z-2e-9-w", 4));
        System.out.println(solution.licenseKeyFormatting("2-5g-3-J", 2));
    }
}
