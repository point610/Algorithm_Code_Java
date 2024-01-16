package LeetCode.Easy.LCP50;

/**
 * @ClassName LCP50
 * @Description TODO
 * @Author point
 * @Date 2023/9/26 9:42
 * @Version 1.0
 */
class Solution {
    public int giveGem(int[] gem, int[][] operations) {
        int size = operations.length;
        for (int i = 0; i < size; i++) {
            int x = operations[i][0];
            int y = operations[i][1];

            int temp = gem[x] / 2;
            gem[x] -= temp;
            gem[y] += temp;
        }
        int max = 0;
        int min = Integer.MAX_VALUE;
        size = gem.length;
        for (int i = 0; i < size; i++) {
            max = Math.max(max, gem[i]);
            min = Math.min(min, gem[i]);
        }
        return max - min;
    }
}

public class LCP50 {
}
