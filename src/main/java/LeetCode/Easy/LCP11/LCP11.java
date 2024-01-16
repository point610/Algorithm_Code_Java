package LeetCode.Easy.LCP11;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName LeetCode.Easy.LCP11
 * @Description TODO
 * @Author point
 * @Date 2023/9/20 23:55
 * @Version 1.0
 */
class Solution {
    public int expectNumber(int[] scores) {
        Set<Integer> set = new HashSet<>();
        int size = scores.length;
        for (int i = 0; i < size; i++) {
            set.add(scores[i]);
        }
        return set.size();
    }
}

public class LCP11 {
}
