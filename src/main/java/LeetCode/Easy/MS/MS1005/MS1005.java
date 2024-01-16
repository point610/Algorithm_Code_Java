package LeetCode.Easy.MS.MS1005;

/**
 * @ClassName MS1005
 * @Description TODO
 * @Author point
 * @Date 2023/10/12 12:03
 * @Version 1.0
 */
class Solution {
    public int findString(String[] words, String s) {
        for (int i = 0; i < words.length; i++) {
            if (s.equals(words[i])) {
                return i ;
            }
        }
        return -1;
    }
}

public class MS1005 {
}
