package LeetCode.Middle.LeetCode880;

class Solution {
    public String decodeAtIndex(String s, int k) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char cc = s.charAt(i);
            if (Character.isDigit(cc)) {
                int times = cc - '0';
                StringBuilder temp = stringBuilder;
                stringBuilder = new StringBuilder();
                for (int j = 0; j < times; j++) {
                    stringBuilder.append(temp);
                }
            } else {
                stringBuilder.append(cc);
            }

            if (stringBuilder.length() >= k) {
                return String.valueOf(stringBuilder.charAt(k - 1));
            }
        }
        return " ";
    }
}

public class LeetCode880 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.decodeAtIndex("leet2code3", 10));
        System.out.println(solution.decodeAtIndex("ha22", 5));

    }
}
