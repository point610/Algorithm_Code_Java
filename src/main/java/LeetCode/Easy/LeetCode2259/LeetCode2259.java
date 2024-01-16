package LeetCode.Easy.LeetCode2259;

/**
 * @ClassName LeetCode2259
 * @Description TODO
 * @Author point
 * @Date 2023/9/30 23:55
 * @Version 1.0
 */
class Solution {
    public String removeDigit(String number, char digit) {

        int size = number.length();
        for (int i = 0; i < size - 1; i++) {
            if (number.charAt(i) == digit) {
                int nextindex = i + 1;
                while (nextindex < size && number.charAt(i) == number.charAt(nextindex)) {
                    nextindex++;
                }
                if (nextindex == size) {
                    break;
                }
                if (number.charAt(i) < number.charAt(nextindex)) {
                    StringBuilder stringBuilder = new StringBuilder(number);
                    stringBuilder.replace(i, i + 1, "");
                    return stringBuilder.toString();
                } else {
                    i = nextindex - 1;
                }
            }
        }
        for (int i = size - 1; i >= 0; i--) {
            if (number.charAt(i) == digit) {
                StringBuilder stringBuilder = new StringBuilder(number);
                stringBuilder.replace(i, i + 1, "");
                return stringBuilder.toString();
            }
        }
        return "";
    }
}

public class LeetCode2259 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.removeDigit("551", '5'));
    }
}
