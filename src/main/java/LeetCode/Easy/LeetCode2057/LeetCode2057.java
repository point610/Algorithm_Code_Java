package LeetCode.Easy.LeetCode2057;

/**
 * @ClassName LeetCode2057
 * @Description TODO
 * @Author point
 * @Date 2023/9/30 11:14
 * @Version 1.0
 */
class Solution {
    public int smallestEqual(int[] nums) {

        int size = nums.length;
        for (int i = 0; i < size; i++) {
            if (i % 10 == nums[i]) {
                return i;
            }
        }
        return -1;
    }
}

public class LeetCode2057 {
}
