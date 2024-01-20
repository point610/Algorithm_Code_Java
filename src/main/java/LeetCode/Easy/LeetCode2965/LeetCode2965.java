package LeetCode.Easy.LeetCode2965;

class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int[] ll = new int[n * n + 1];

        for (int[] iiii : grid) {
            for (int jjjj : iiii) {
                ll[jjjj]++;
            }
        }

        int a = 0;
        int b = 0;
        for (int i = 1; i <= n * n; i++) {
            if (ll[i] == 0) {
                b = i;
            } else if (ll[i] == 2) {
                a = i;
            }

        }
        return new int[]{a, b};
    }
}

public class LeetCode2965 {
}
