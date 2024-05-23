package LeetCode.Middle.LeetCode788;

import java.util.HashSet;
import java.util.Set;

class Solution {
    private Set<Integer> no;
    private Set<Integer> can;

    public int rotatedDigits(int n) {
        initial();
        int res = 0;
        for (int i = 1; i <= n; i++) {
            if (isValid(i)) {
                res++;
            }
        }
        return res;
    }

    private void initial() {
        no = new HashSet<>();
        can = new HashSet<>();

        no.add(3);
        no.add(4);
        no.add(7);

        can.add(2);
        can.add(5);
        can.add(6);
        can.add(9);
    }

    private boolean isValid(int one) {
        boolean res = false;

        while (one > 0) {
            int temp = one % 10;
            if (no.contains(temp)) {
                return false;
            }
            if (can.contains(temp)) {
                res = true;
            }
            one /= 10;
        }
        return res;
    }
}

public class LeetCode788 {
}
