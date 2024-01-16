package LeetCode.Easy.LeetCode415;

/**
 * @ClassName LeetCode415
 * @Description TODO
 * @Author point
 * @Date 2023/7/16 23:52
 * @Version 1.0
 */
class Solution {
    public String addStrings(String num1, String num2) {

        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder one = new StringBuilder(num1);
        StringBuilder two = new StringBuilder(num2);

        int size = Math.max(one.length(), two.length());
        while (one.length() < size) {
            one.insert(0, '0');
        }
        while (two.length() < size) {
            two.insert(0, '0');
        }
        int index = size - 1;
        int sign = 0;
        while (0 <= index) {
            int o = (one.charAt(index) - '0');
            int t = (two.charAt(index) - '0');
            int sum = o + t + sign;
            if (sum >= 10) {
                sign = 1;
                stringBuilder.insert(0, (char) ('0' + (sum % 10)));

            } else {
                sign = 0;
                stringBuilder.insert(0, (char) ('0' + sum));

            }
            index--;
        }
        if (sign == 1) {
            stringBuilder.insert(0, '1');

        }
        return String.valueOf(stringBuilder);

    }
}

public class LeetCode415 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.addStrings("999", "1"));
    }
}
