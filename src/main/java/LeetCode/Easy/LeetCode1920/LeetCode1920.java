package LeetCode.Easy.LeetCode1920;

/**
 * @ClassName v
 * @Description TODO
 * @Author point
 * @Date 2023/9/29 12:15
 * @Version 1.0
 */
class Solution {
    public int[] buildArray(int[] nums) {
        int size = nums.length;
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = nums[nums[i]];
        }
        return arr;

    }
}

public class LeetCode1920 {
}
