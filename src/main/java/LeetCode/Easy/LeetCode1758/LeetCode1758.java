package LeetCode.Easy.LeetCode1758;

/**
 * @ClassName LeetCode1758
 * @Description TODO
 * @Author point
 * @Date 2023/9/28 17:06
 * @Version 1.0
 */
class Solution {
    public int minOperations(String s) {
        int one = 0;

        int sizez = s.length();
        for (int i = 0; i < sizez; i++) {
            if (i % 2 == 0) {
                // ou is one
                if (s.charAt(i) != '1') {
                    one++;
                }
            } else {
                // ji is zero
                if (s.charAt(i) == '1') {
                    one++;
                }
            }
        }

        int two = 0;
        for (int i = 0; i < sizez; i++) {
            if (i % 2 == 0) {
                // ou is one
                if (s.charAt(i) == '1') {
                    two++;
                }
            } else {
                // ji is zero
                if (s.charAt(i) != '1') {
                    two++;
                }
            }
        }

        return Math.min(one, two);
    }
}

public class LeetCode1758 {
}
