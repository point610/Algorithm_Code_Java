package LeetCode.Easy.MS.MS1704;

/**
 * @ClassName MS1704
 * @Description TODO
 * @Author point
 * @Date 2023/10/12 15:56
 * @Version 1.0
 */
class Solution {
    public int missingNumber(int[] nums) {
        int size = nums.length;
        boolean[] has = new boolean[size + 1];
        for (int i = 0; i < size; i++) {
            has[nums[i]] = true;
        }
        for (int i = 0; i <= size; i++) {
            if (!has[i]) {
                return i;
            }
        }
        return size;
    }
}

public class MS1704 {
}
