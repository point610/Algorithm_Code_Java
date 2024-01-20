package LeetCode.Easy.LeetCode2980;

class Solution {
    public boolean hasTrailingZeros(int[] nums) {
        int size = nums.length;
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (((nums[i] | nums[j] ) %2== 0)) {
                    return true;
                }
            }
        }
        return false;
    }

}

public class LeetCode2980 {
}
