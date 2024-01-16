package LeetCode.Easy.LeetCode455;

import java.util.Arrays;

/**
 * @ClassName LeetCode455
 * @Description TODO
 * @Author point
 * @Date 2023/7/28 0:39
 * @Version 1.0
 */
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int gindex = g.length - 1;
        int sindex = s.length - 1;
        int sum = 0;
        while (gindex >= 0 && sindex >= 0) {

            if (s[sindex] >= g[gindex]) {
                sum++;
                sindex--;
                gindex--;
            } else {
                gindex--;
            }

        }

        return sum;
    }
}

public class LeetCode455 {
}
