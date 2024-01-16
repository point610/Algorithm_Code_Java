package LeetCode.Easy.LeetCode2903;

/**
 * @ClassName LeetCode2903
 * @Description TODO
 * @Author point
 * @Date 2024/1/16 23:08
 * @Version 1.0
 */
class Solution {
    public int[] findIndices(int[] nums, int indexDifference, int valueDifference) {

        int size = nums.length;
        for (int i = 0; i < size; i++) {
            for (int j = i + indexDifference; j < size; j++) {
                if (valueDifference <= Math.abs(nums[i] - nums[j])) {
                    return new int[]{i, j}
                            ;
                }
            }
        }
        return new int[]{-1, -1};
    }
}

public class LeetCode2903 {
}
