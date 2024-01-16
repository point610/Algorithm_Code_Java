package LeetCode.Easy.LeetCode2278;

/**
 * @ClassName LeetCode2278
 * @Description TODO
 * @Author point
 * @Date 2023/10/1 0:32
 * @Version 1.0
 */
class Solution {
    public int percentageLetter(String s, char letter) {
        int size = s.length();
        int times = 0;
        for (int i = 0; i < size; i++) {
            if (s.charAt(i) == letter) {
                times++;
            }
        }
        return times * 100 / size;

    }
}

public class LeetCode2278 {
}
