package LeetCode.Easy.LeetCode1876;

/**
 * @ClassName LeetCode1876
 * @Description TODO
 * @Author point
 * @Date 2023/9/29 11:19
 * @Version 1.0
 */
class Solution {
    boolean diff(char a, char b, char c) {
        return a != b && a != c && b != c;
    }

    public int countGoodSubstrings(String s) {
        int size = s.length();
        int sum = 0;
        for (int i = 0; i < size - 2; i++) {
            if (diff(s.charAt(i), s.charAt(i + 1), s.charAt(i + 2))) {
                sum++;
            }

        }return sum;
    }
}

public class LeetCode1876 {
}
