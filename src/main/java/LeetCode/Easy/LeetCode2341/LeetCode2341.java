package LeetCode.Easy.LeetCode2341;

/**
 * @ClassName LeetCode2341
 * @Description TODO
 * @Author point
 * @Date 2023/10/1 15:20
 * @Version 1.0
 */
class Solution {
    public int[] numberOfPairs(int[] nums) {

        int[] arr = new int[101];
        int size = nums.length;
        for (int i = 0; i < size; i++) {
            arr[nums[i]]++;
        }
        int shudui = 0;
        int left = 0;
        for (int i = 0; i <= 100; i++) {
            shudui += arr[i] / 2;
            left += arr[i] % 2;
        }
        return new int[]{shudui, left};
    }
}

public class LeetCode2341 {
}
