package LeetCode.Easy.LeetCode504;

/**
 * @ClassName LeetCode504
 * @Description TODO
 * @Author point
 * @Date 2023/8/9 0:19
 * @Version 1.0
 */
class Solution {
    public String convertToBase7(int num) {
        if (num == 0) {
            return "0";
        }
        boolean fu = num < 0;
        StringBuilder stringBuilder = new StringBuilder();
        num = Math.abs(num);
        while (num != 0) {
            stringBuilder.insert(0, (char) ('0' + (num % 7)));

            num /= 7;
        }
        if (fu) {
            stringBuilder.insert(0, '-');
        }
        return String.valueOf(stringBuilder);

    }
}

public class LeetCode504 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.convertToBase7(-7));
    }
}
