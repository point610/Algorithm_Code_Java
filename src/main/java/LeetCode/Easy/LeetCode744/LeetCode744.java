package LeetCode.Easy.LeetCode744;

/**
 * @ClassName LeetCode744
 * @Description TODO
 * @Author point
 * @Date 2023/8/10 20:26
 * @Version 1.0
 */
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int sub = 50;
        int size = letters.length;
        for (int i = 0; i < size; i++) {
            if (letters[i] > target && sub > (letters[i] - target)) {
                sub = letters[i] - target;
            }
        }
        return sub == 50 ? letters[0] : (char) (target + sub);
    }
}

public class LeetCode744 {
}
