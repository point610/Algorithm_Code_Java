package LeetCode.Middle.LeetCode462;

import java.util.Arrays;

class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int size = nums.length;
        int res = 0;
        int target = nums[size / 2];
        for (int ii : nums) {
            res += Math.abs(ii - target);
        }

        return res;
    }


}

public class LeetCode462 {
}
