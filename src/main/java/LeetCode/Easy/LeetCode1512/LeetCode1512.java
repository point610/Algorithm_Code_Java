package LeetCode.Easy.LeetCode1512;

/**
 * @ClassName LeetCode1512
 * @Description TODO
 * @Author point
 * @Date 2023/9/27 16:26
 * @Version 1.0
 */
class Solution {
    int getNumber(int n) {
        return n * (n - 1) / 2;
    }

    public int numIdenticalPairs(int[] nums) {
        int[] arr = new int[101];
        int size = nums.length;
        for (int i = 0; i < size; i++) {
            arr[nums[i]]++;
        }
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += getNumber(arr[i]);
        }
        return sum;
    }
}

public class LeetCode1512 {
}
