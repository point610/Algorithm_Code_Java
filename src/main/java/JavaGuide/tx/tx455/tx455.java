package JavaGuide.tx.tx455;

import java.util.Arrays;

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int res = 0;

        int gindex = 0;
        for (int i = 0; i < s.length; i++) {
            if (gindex == g.length) {
                break;
            }
            if (g[gindex] <= s[i]) {
                gindex++;
                res++;
            }
        }

        return res;
    }
}

public class tx455 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.findContentChildren(new int[]{10, 9, 8, 7}, new int[]{5, 6, 7, 8}));
        System.out.println(solution.findContentChildren(new int[]{1, 2, 3}, new int[]{1, 1}));
        System.out.println(solution.findContentChildren(new int[]{1, 2}, new int[]{1, 2, 3}));
    }
}
