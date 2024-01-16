package LeetCode.Easy.LeetCode1470;

/**
 * @ClassName LeetCode1470
 * @Description TODO
 * @Author point
 * @Date 2023/9/27 0:51
 * @Version 1.0
 */
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int size = nums.length;
        int[] res = new int[size];
        int index = 0;
        for (int i = 0; i < size / 2; i++) {
            res[index++] = nums[i];
            res[index++] = nums[i + n];
        }
        return res;
    }
}

public class LeetCode1470 {
}
