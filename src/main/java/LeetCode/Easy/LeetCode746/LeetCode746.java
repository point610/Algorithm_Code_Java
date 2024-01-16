package LeetCode.Easy.LeetCode746;

/**
 * @ClassName LeetCode746
 * @Description TODO
 * @Author point
 * @Date 2023/8/10 20:39
 * @Version 1.0
 */
class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int size = cost.length;

        for (int i = 2; i < size; i++) {
            cost[i] += Math.min(cost[i - 1], cost[i - 2]);
        }

        return Math.min(cost[size - 1], cost[size - 2]);
    }
}

public class LeetCode746 {
}
