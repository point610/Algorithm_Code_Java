package LeetCode.Middle.LeetCode453;

class Solution {
    public int minMoves(int[] nums) {
        int min = Integer.MAX_VALUE;
        for (int ii : nums) {
            min = Math.min(min, ii);
        }
        int res = 0;
        for (int ii : nums) {
            res += ii - min;
        }
        return res;
    }
}

public class LeetCode453 {
}
