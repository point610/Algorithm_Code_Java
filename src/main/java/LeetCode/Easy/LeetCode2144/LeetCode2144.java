package LeetCode.Easy.LeetCode2144;

import java.util.Arrays;

/**
 * @ClassName LeetCode2144
 * @Description TODO
 * @Author point
 * @Date 2023/9/30 22:43
 * @Version 1.0
 */
class Solution {
    public int minimumCost(int[] cost) {

        int size = cost.length;
        int i = size - 1;
        int sum = 0;
        Arrays.sort(cost);
        for (i = size - 1; (i - 3) >= -1; i -= 3) {
            sum += (cost[i] + cost[i - 1]);
        }
        if (i < 0) {
            return sum;
        }
        for (int j = 0; j <= i; j++) {
            sum += cost[j];
        }
        return sum;
    }
}

public class LeetCode2144 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.minimumCost(new int[]{6,5,7,9,2,2}));
    }
}
