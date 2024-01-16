package LeetCode.Easy.LeetCode1629;

/**
 * @ClassName LeetCode1629
 * @Description TODO
 * @Author point
 * @Date 2023/9/28 12:41
 * @Version 1.0
 */
class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        int size = keysPressed.length();
        int maxtime = releaseTimes[0];
        char charmax = keysPressed.charAt(0);
        for (int i = 1; i < size; i++) {
            if (releaseTimes[i] - releaseTimes[i - 1] > maxtime) {
                maxtime = releaseTimes[i] - releaseTimes[i - 1];
                charmax = keysPressed.charAt(i);
            } else if (releaseTimes[i] - releaseTimes[i - 1] == maxtime) {
                charmax = (char) Math.max(charmax, keysPressed.charAt(i));

            }
        }
        return charmax;

    }
}

public class LeetCode1629 {
}
