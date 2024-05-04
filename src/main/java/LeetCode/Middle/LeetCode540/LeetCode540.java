package LeetCode.Middle.LeetCode540;

class Solution {
    public int singleNonDuplicate(int[] nums) {
        int one = nums[0];
        for (int i = 1; i < nums.length; i++) {
            one = one ^ nums[i];
        }
        return one;
    }
}

public class LeetCode540 {
}
