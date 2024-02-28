package LeetCode.Middle.LeetCode2673;

class Solution {
    public int minIncrements(int n, int[] cost) {
        int size = cost.length;
        int res = 0;
        for (int i = size - 1; i > 0; i -= 2) {
            res += Math.abs(cost[i] - cost[i - 1]);
            cost[(i - 1) / 2] += Math.max(cost[i], cost[i - 1]);
        }
        return res;
    }
}

public class LeetCode2673 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.minIncrements(7, new int[]{1, 5, 2, 2, 3, 3, 1}));
        System.out.println(solution.minIncrements(3, new int[]{5, 3, 3}));
    }
}
