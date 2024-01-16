package LeetCode.Easy.LeetCode2839;

/**
 * @ClassName LeetCode2839
 * @Description TODO
 * @Author point
 * @Date 2023/9/19 23:46
 * @Version 1.0
 */
class Solution {
    public boolean canBeEqual(String s1, String s2) {
        if (s1.charAt(0) == s2.charAt(0) && s1.charAt(2) == s2.charAt(2) || s1.charAt(0) == s2.charAt(2) && s1.charAt(2) == s2.charAt(0)) {
            if (s1.charAt(1) == s2.charAt(1) && s1.charAt(3) == s2.charAt(3) || s1.charAt(1) == s2.charAt(3) && s1.charAt(3) == s2.charAt(1)) {
                return true;
            }
        }
        return false;
    }
}

public class LeetCode2839 {
}
