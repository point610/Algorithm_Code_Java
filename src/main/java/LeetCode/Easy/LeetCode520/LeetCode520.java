package LeetCode.Easy.LeetCode520;

/**
 * @ClassName LeetCode520
 * @Description TODO
 * @Author point
 * @Date 2023/8/9 22:31
 * @Version 1.0
 */
class Solution {
    public boolean detectCapitalUse(String word) {
        int size = word.length();
        if (size == 1) {
            return true;
        }
         if (!isSmall(word.charAt(0)) && !isSmall(word.charAt(1))) {
            for (int i = 1; i < size; i++) {
                if (isSmall(word.charAt(i))) {
                    return false;
                }
            }
            return true;
        } else {
            for (int i = 1; i < size; i++) {
                if (!isSmall(word.charAt(i))) {
                    return false;
                }
            }
            return true;
        }
    }

    boolean isSmall(char c) {
        return 'a' <= c && c <= 'z';
    }

}

public class LeetCode520 {

    public static void main(String[] args) {
        Solution solution =new Solution();
        System.out.println(solution.detectCapitalUse("Google"));
    }
}
