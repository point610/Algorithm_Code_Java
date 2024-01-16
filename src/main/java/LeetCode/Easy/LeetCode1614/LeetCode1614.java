package LeetCode.Easy.LeetCode1614;

/**
 * @ClassName LeetCode1614
 * @Description TODO
 * @Author point
 * @Date 2023/9/28 12:16
 * @Version 1.0
 */
class Solution {
    public int maxDepth(String s) {
        int left = 0;
        int max = 0;
        int size = s.length();
        for (int i = 0; i < size; i++) {
            if (s.charAt(i) == '(') {
                left++;
            }
            max = Math.max(max, left);
            if (s.charAt(i) == ')') {
                left--;
            }
        }
        return max;
    }
}

public class LeetCode1614 {
}
