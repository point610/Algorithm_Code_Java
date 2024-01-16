package LeetCode.Easy.LeetCode405;


/**
 * @ClassName LeetCode405
 * @Description TODO
 * @Author point
 * @Date 2023/7/15 11:42
 * @Version 1.0
 */
class Solution {
    char[] chars = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    char getHex(String str) {
        int res = 0;
        int pow = 1;
        for (int i = 3; i >= 0; i--) {
            if (str.charAt(i) == '1') {
                res += pow;
            }
            pow *= 2;
        }
        return chars[res];
    }

    public String toHex(int num) {
        if (num == 0) {
            return "0";
        }
        StringBuilder string = new StringBuilder(Integer.toBinaryString(num));
        StringBuilder stringBuilder = new StringBuilder();
        while (string.length() != 32) {
            string.insert(0, '0');
        }
        if (string.charAt(0) == '1') {
            for (int i = 0; i < 8; i++) {
                String charSequence = string.substring(i * 4, i * 4 + 4);
                stringBuilder.append(getHex(charSequence));
                // System.out.println(charSequence);
            }
        } else {
            boolean sign = false;
            for (int i = 0; i < 8; i++) {
                String charSequence = string.substring(i * 4, i * 4 + 4);
                if (getHex(charSequence) == '0' && sign == false) {

                } else {
                    stringBuilder.append(getHex(charSequence));
                    sign = true;
                }
                // System.out.println(charSequence);
            }
        }
        return String.valueOf(stringBuilder);
    }
}

public class LeetCode405 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.toHex(26));
    }
}
