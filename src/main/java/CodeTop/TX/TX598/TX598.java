package CodeTop.TX.TX598;

class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        int onemin = m;
        int twomin = n;

        for (int[] iii : ops) {
            onemin = Math.min(onemin, iii[0]);
            twomin = Math.min(twomin, iii[1]);
        }

        return onemin * twomin;
    }
}

public class TX598 {
}
