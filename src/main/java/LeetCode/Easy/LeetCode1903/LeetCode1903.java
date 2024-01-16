package LeetCode.Easy.LeetCode1903;

/**
 * @ClassName LeetCode1903
 * @Description TODO
 * @Author point
 * @Date 2023/9/29 11:44
 * @Version 1.0
 */
class Solution {
    boolean isji(char c) {
        return (c - '0') % 2 == 1;
    }

    public String largestOddNumber(String num) {
        int size = num.length();
        for (int i = size - 1; i >= 0; i--) {
            if (isji(num.charAt(i))) {
                return num.substring(0, i + 1);
            }

        }
        return "";
    }
}

public class LeetCode1903 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.largestOddNumber("4206"));
    }
}
