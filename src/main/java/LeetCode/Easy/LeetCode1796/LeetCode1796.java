package LeetCode.Easy.LeetCode1796;

/**
 * @ClassName LeetCode1796
 * @Description TODO
 * @Author point
 * @Date 2023/9/28 18:51
 * @Version 1.0
 */
class Solution {
    public int secondHighest(String s) {
        int size = s.length();
        int[] list = new int[10];
        for (int i = 0; i < size; i++) {
            if ('0' <= s.charAt(i) && s.charAt(i) <= '9') {
                list[s.charAt(i) - '0']++;
            }
        }
        // find
        int times = 0;
        for (int i = 9; i >= 0; i--) {
            if (list[i] > 0) {
                times++;
                if (times == 2) {
                    return i;
                }
            }

        }
        return -1;
    }
}

public class LeetCode1796 {
}
