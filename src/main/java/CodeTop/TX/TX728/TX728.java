package CodeTop.TX.TX728;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (can(i)) {
                list.add(i);
            }
        }
        return list;
    }

    private boolean can(int one) {
        int two = one;
        while (two != 0) {
            int temp = two % 10;
            if (temp == 0) {
                return false;
            }
            if (one % temp != 0) {
                return false;
            }
            two /= 10;
        }
        return true;
    }
}

public class TX728 {
}
