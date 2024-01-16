package LeetCode.Easy.LeetCode2535;

/**
 * @ClassName LeetCode2535
 * @Description TODO
 * @Author point
 * @Date 2023/10/3 10:59
 * @Version 1.0
 */
    class Solution {
        int getnumber(int n) {
            int sum = 0;
            while (n != 0) {
                sum += n % 10;
                n /= 10;
            }
            return sum;
        }

        public int differenceOfSum(int[] nums) {
            int sum = 0;
            int size = nums.length;
            for (int i = 0; i < size; i++) {
                sum += nums[i];
                sum -= getnumber(nums[i]);
            }
            return sum;
        }
    }

public class LeetCode2535 {
}
