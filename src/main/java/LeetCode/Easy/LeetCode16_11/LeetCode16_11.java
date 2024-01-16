package LeetCode.Easy.LeetCode16_11;

import java.util.*;

/**
 * @ClassName LeetCode16_11
 * @Description TODO
 * @Author point
 * @Date 2023/8/12 0:32
 * @Version 1.0
 */
class Solution {


    public int[] divingBoard(int shorter, int longer, int k) {
        if (k == 0) {
            return new int[0];
        }
        if (shorter == longer) {
            return new int[]{k * shorter};
        }
        int step = longer - shorter;
        int temp = k * shorter;
        List<Integer> res = new ArrayList<>();
        res.add(temp);
        for (int i = 0; i < k; i++) {
            temp = temp + step;
            res.add(temp);
        }
        res.sort(Comparator.naturalOrder());
        return res.stream().mapToInt(Integer::valueOf).toArray();
    }

}

public class LeetCode16_11 {

}
