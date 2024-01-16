package LeetCode.Easy.LeetCode645;

/**
 * @ClassName LeetCode645
 * @Description TODO
 * @Author point
 * @Date 2023/10/12 16:22
 * @Version 1.0
 */
class Solution {
    public int[] findErrorNums(int[] nums) {
        int size = nums.length;
        int[] arr = new int[size + 1];
        for (int i = 0; i < size; i++) {
            arr[nums[i]]++;
        }
        int zero = 0;
        int two = 0;
        for (int i = 1; i <= size; i++) {
            if (arr[i] == 0) {
                zero = i;
            }
            if (arr[i] == 2) {
                two = i;
            }
        }
            return new int[]{two, zero};
    }
}

public class LeetCode645 {
}
