package LeetCode.Easy.LCR088;

/**
 * @ClassName LCR088
 * @Description TODO
 * @Author point
 * @Date 2023/10/8 22:37
 * @Version 1.0
 */
class Solution {
    public int minCostClimbingStairs(int[] cost) {

        int size = cost.length;
        if (size == 1) {
            return cost[0];
        }
        if (size == 2) {
            return Math.min(cost[0], cost[1]);
        }
        for (int i = 2; i < size; i++) {
            cost[i] += Math.min(cost[i - 1], cost[i - 2]);
        }
        return Math.min(cost[size - 1], cost[size - 2]);

    }
}

public class LCR088 {
}
