package CodeTop.TX.TX217;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int iii : nums) {
            if (set.contains(iii)) {
                return true;
            }
            set.add(iii);
        }
        return false;
    }
}

public class TX217 {
}
