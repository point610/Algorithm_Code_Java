package LeetCode.Easy.LeetCode1332;

/**
 * @ClassName LeetCode1332
 * @Description TODO
 * @Author point
 * @Date 2023/9/17 10:32
 * @Version 1.0
 */
class Solution {
    static StringBuilder stringBuilder;

    static boolean isHuiwen(StringBuilder temp) {
        int size = temp.length() / 2;
        for (int i = 0; i < size; i++) {
            if (temp.charAt(i) != temp.charAt(temp.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public int removePalindromeSub(String s) {

        if (isHuiwen(new StringBuilder(s))) {
            return 1;
        }
        return 2;

    }
}

public class LeetCode1332 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.removePalindromeSub("baabb"));

    }
}
