package LeetCode.Middle.LeetCode831;

class Solution {
    public String maskPII(String s) {

        if (s.contains("@")) {
            return getmail(s);
        } else {
            return getphone(s);
        }
    }

    private String getmail(String one) {
        String[] split = one.toLowerCase().split("@");
        split[0] = Character.toLowerCase(split[0].charAt(0)) + "*****" + Character.toLowerCase(split[0].charAt(split[0].length() - 1));
        return split[0] + "@" + split[1];
    }

    private String getphone(String one) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < one.length(); i++) {
            if (Character.isDigit(one.charAt(i))) {
                stringBuilder.append(one.charAt(i));
            }
        }
        switch (stringBuilder.length()) {
            case 10: {
                return "***-***-" + stringBuilder.substring(6);
            }
            case 11: {
                return "+*-***-***-" + stringBuilder.substring(7);
            }
            case 12: {
                return "+**-***-***-" + stringBuilder.substring(8);
            }
            case 13: {
                return "+***-***-***-" + stringBuilder.substring(9);
            }
        }
        return "0";
    }


}

public class LeetCode831 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.maskPII("LeetCode@LeetCode.com"));
        System.out.println(solution.maskPII("AB@qq.com"));
        System.out.println(solution.maskPII("1(234)567-890"));
    }
}
