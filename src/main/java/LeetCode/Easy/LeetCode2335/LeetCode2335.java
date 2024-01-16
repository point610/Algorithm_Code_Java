package LeetCode.Easy.LeetCode2335;

import java.util.Arrays;

/**
 * @ClassName LeetCode2335
 * @Description TODO
 * @Author point
 * @Date 2023/10/1 11:56
 * @Version 1.0
 */
class Solution {
    public int fillCups(int[] amount) {
        Arrays.sort(amount);
        int left = amount[0] + amount[1];
        if (left == amount[2]) {
            return left;
        } else if (left < amount[2]) {
            return amount[2];
        } else {
            return (int) Math.ceil((left + amount[2]) / 2.0);
        }
    }
}

public class LeetCode2335 {
}
