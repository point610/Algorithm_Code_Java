package CodeTop.HW2.HW202;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();

        while (true) {
            int temp = getpow(n);
            if (temp == 1) {
                return true;
            }
            if (set.contains(temp)) {
                return false;
            }
            set.add(temp);
            n = temp;
        }
    }

    private int getpow(int one) {
        int res = 0;
        while (one != 0) {
            int temp = one % 10;
            one /= 10;
            res += temp * temp;
        }
        return res;
    }
}

public class HW202 {
}
