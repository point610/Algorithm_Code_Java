package LeetCode.Easy.LeetCode1446;

/**
 * @ClassName LeetCode1446
 * @Description TODO
 * @Author point
 * @Date 2023/9/27 0:34
 * @Version 1.0
 */
class Solution {
    public int maxPower(String s) {
        int size = s.length();
        char currentchar = s.charAt(0);
        int times = 1;
        int max = 1;
        for (int i = 1; i < size; i++) {
            if (currentchar == s.charAt(i)) {
                times++;
            } else {
                times = 1;
                currentchar = s.charAt(i);
            }
            max = Math.max(max, times);

        }
        return max;
    }
}

public class LeetCode1446 {
}
