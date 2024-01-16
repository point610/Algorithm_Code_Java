package CodeTop.HW.HW260;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName HW260
 * @Description TODO
 * @Author point
 * @Date 2023/12/30 17:20
 * @Version 1.0
 */
class Solution {
    public int[] singleNumber(int[] nums) {
        int size = nums.length;
        if (size == 2) {
            return nums;
        }
        Set<Integer> set = new HashSet<>();
        for (int ii : nums) {
            if (set.contains(ii)) {
                set.remove(ii);
            } else {
                set.add(ii);
            }
        }
        int index = 0;
        int[] list = new int[set.size()];
        for (Integer ii : set) {
            list[index++] = ii;
        }
        return list;
    }
}

public class HW260 {
}
