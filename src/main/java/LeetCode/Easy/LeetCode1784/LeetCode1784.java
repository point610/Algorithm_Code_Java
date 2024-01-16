package LeetCode.Easy.LeetCode1784;

/**
 * @ClassName LeetCode1784
 * @Description TODO
 * @Author point
 * @Date 2023/9/28 18:40
 * @Version 1.0
 */
class Solution {
    public boolean checkOnesSegment(String s) {
        int size = s.length();
        if (size == 1) {
            return true;
        }
        int index = 0;
        int onetimes = 0;
        while (index < size) {
            if (s.charAt(index) == '1') {
                onetimes++;
                while (index < size && s.charAt(index) == '1') {
                    index++;
                }
            }
            index++;
        }
        return onetimes <= 1;

    }
}

public class LeetCode1784 {
}
