package LeetCode.Easy.MS.MS0109;

/**
 * @ClassName MS0109
 * @Description TODO
 * @Author point
 * @Date 2023/10/10 22:35
 * @Version 1.0
 */
class Solution {
    public boolean isFlipedString(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        int size = s1.length();
        if (size == 0) {
            return true;
        }
        for (int i = 0; i < size; i++) {
            if (s1.equals(s2.substring(i) + s2.substring(0, i))) {
                return true;
            }
        }
        return false;
    }
}

public class MS0109 {
}
