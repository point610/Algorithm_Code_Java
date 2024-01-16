package LeetCode.Easy.LeetCode2696;

/**
 * @ClassName LeetCode2696
 * @Description TODO
 * @Author point
 * @Date 2023/10/1 17:38
 * @Version 1.0
 */
class Solution {
    public int minLength(String s) {

        boolean one = true;
        boolean two = true;
        while (one || two) {
            one = false;
            two = false;

            while (s.indexOf("AB") != -1) {
                s = s.replace("AB", "");
                one = true;
            }

            while (s.indexOf("CD") != -1) {
                s = s.replace("CD", "");
                two = true;
            }
        }
        return s.length();
    }
}

public class LeetCode2696 {
}
