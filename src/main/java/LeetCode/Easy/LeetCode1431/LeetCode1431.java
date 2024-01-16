package LeetCode.Easy.LeetCode1431;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName LeetCode1431
 * @Description TODO
 * @Author point
 * @Date 2023/9/27 0:20
 * @Version 1.0
 */
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        int size = candies.length;
        for (int i = 0; i < size; i++) {
            max = Math.max(max, candies[i]);
        }
        List<Boolean> res = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            res.add(candies[i] + extraCandies >= max);
        }
        return res;
    }
}

public class LeetCode1431 {
}
