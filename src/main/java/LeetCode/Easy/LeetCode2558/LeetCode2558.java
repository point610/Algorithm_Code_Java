package LeetCode.Easy.LeetCode2558;

import java.util.Arrays;

/**
 * @ClassName LeetCode2558
 * @Description TODO
 * @Author point
 * @Date 2023/10/3 11:47
 * @Version 1.0
 */
class Solution {
    public long pickGifts(int[] gifts, int k) {
        int size = gifts.length;
        for (int i = 0; i < k; i++) {
            Arrays.sort(gifts);
            gifts[size - 1] = (int) Math.sqrt(gifts[size - 1]);

        }
        long sum = 0;
        for (int i = 0; i < size; i++) {
            sum += gifts[i];
        }
        return sum;
    }
}

public class LeetCode2558 {
}
