package LeetCode.Easy.LeetCode1295;

/**
 * @ClassName LeetCode1295
 * @Description TODO
 * @Author point
 * @Date 2023/9/17 9:04
 * @Version 1.0
 */
class Solution {
    static int getNumber(int n) {
        if (n < 10) {
            return 1;
        }
        if (n < 100) {
            return 2;
        }
        if (n < 1000) {
            return 3;
        }
        if (n < 10000) {
            return 4;
        }
        if (n < 100000) {
            return 5;
        }
        return 6;
    }

    public int findNumbers(int[] nums) {
        int sum = 0;
        int size = nums.length;
        for (int i = 0; i < size; i++) {
            if (getNumber(nums[i]) % 2 == 0) {
                sum++;
            }
        }
        return sum;
    }
}

public class LeetCode1295 {
}
