package LeetCode.Easy.LeetCode459;

/**
 * @ClassName LeetCode459
 * @Description TODO
 * @Author point
 * @Date 2023/7/28 0:16
 * @Version 1.0
 */
class Solution {
    public boolean repeatedSubstringPattern(String s) {
        return (s + s).indexOf(s, 1) != s.length();
    }
}

public class LeetCode459 {
    public static void main(String[] args) {

    }
}
