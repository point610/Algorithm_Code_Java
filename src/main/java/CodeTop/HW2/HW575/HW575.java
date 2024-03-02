package CodeTop.HW2.HW575;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int distributeCandies(int[] candyType) {
        int size = candyType.length;
        Set<Integer> set = new HashSet<>();
        for (int ii : candyType) {
            set.add(ii);
        }
        return Math.min(set.size(), size / 2);
    }
}

public class HW575 {
}
