package LeetCode.Easy.LeetCode771;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName LeetCode771
 * @Description TODO
 * @Author point
 * @Date 2023/7/24 22:52
 * @Version 1.0
 */
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < jewels.length(); i++) {
            set.add(jewels.charAt(i));
        }
        int res = 0;
        for (int i = 0; i < stones.length(); i++) {
            if (set.contains(stones.charAt(i))) {
                res++;
            }
        }
        return res;

    }
}

public class LeetCode771 {
}
