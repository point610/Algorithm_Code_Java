package LeetCode.Easy.LeetCode2848;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @ClassName LeetCode2848
 * @Description TODO
 * @Author point
 * @Date 2023/9/19 23:43
 * @Version 1.0
 */
class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {
        Set<Integer> set = new HashSet<>();
        int size = nums.size();
        for (int i = 0; i < size; i++) {
            for (int j = nums.get(i).get(0); j <= nums.get(i).get(1); j++) {
                set.add(j);
            }
        }
        return set.size();
    }
}

public class LeetCode2848 {
}
