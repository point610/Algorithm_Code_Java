package LeetCode.Easy.LeetCode2220;

/**
 * @ClassName LeetCode2220
 * @Description TODO
 * @Author point
 * @Date 2023/9/30 23:07
 * @Version 1.0
 */
class Solution {
    public int minBitFlips(int start, int goal) {
        StringBuilder one = new StringBuilder(Integer.toBinaryString(start));
        StringBuilder two = new StringBuilder(Integer.toBinaryString(goal));

        int size = Math.max(one.length(), two.length());
        if (one.length() > two.length()) {
            while (one.length() != two.length()) {
                two.insert(0, '0');
            }
        } else if (one.length() < two.length()) {
            while (one.length() != two.length()) {
                one.insert(0, '0');
            }
        }
        int diff = 0;
        for (int i = 0; i < size; i++) {
            if (one.charAt(i) != two.charAt(i)) {
                diff++;
            }
        }
        return diff;

    }
}

public class LeetCode2220 {
}
