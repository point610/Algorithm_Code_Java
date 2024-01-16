package LeetCode.Easy.LeetCode2460;

/**
 * @ClassName LeetCode2460
 * @Description TODO
 * @Author point
 * @Date 2023/10/2 12:09
 * @Version 1.0
 */
class Solution {
    public int[] applyOperations(int[] nums) {
        int size = nums.length;
        for (int i = 0; i < size - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                nums[i] *= 2;
                nums[i + 1] = 0;
            }
        }
        int[] res = new int[size];
        int index = 0;
        for (int i = 0; i < size; i++) {
            if (nums[i] != 0) {
                res[index++] = nums[i];
            }
        }
        return res;
    }
}

public class LeetCode2460 {
}
