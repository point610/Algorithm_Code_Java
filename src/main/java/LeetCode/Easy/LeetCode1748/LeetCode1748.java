package LeetCode.Easy.LeetCode1748;

/**
 * @ClassName LeetCode1748
 * @Description TODO
 * @Author point
 * @Date 2023/9/28 16:54
 * @Version 1.0
 */
class Solution {
    public int sumOfUnique(int[] nums) {
        byte[] arr = new byte[101];

        byte size = (byte) nums.length;
        for (byte i = 0; i < size; i++) {
            arr[nums[i]]++;
        }

        int sum = 0;
        for (byte i = 0; i < 101; i++) {
            if (arr[i] == 1) {
                sum += i;
            }
        }
        return sum;
    }
}

public class LeetCode1748 {
}
