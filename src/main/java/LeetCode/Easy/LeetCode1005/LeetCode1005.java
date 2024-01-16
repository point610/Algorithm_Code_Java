package LeetCode.Easy.LeetCode1005;

import java.util.Arrays;

/**
 * @ClassName LeetCode1005
 * @Description TODO
 * @Author point
 * @Date 2023/8/18 13:48
 * @Version 1.0
 */
class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        int size = nums.length;
        int i = 0;
        for (i = 0; i < size && k > 0; i++, k--) {
            if (nums[i] > 0) {
                break;
            }
            if (nums[i] < 0) {
                nums[i] = -nums[i];
            }

            if (nums[i] == 0) {
                // 直接返回
                return getSum(nums);
            }

        }
        Arrays.sort(nums);
        if (k % 2 == 1) {
            nums[0] = -nums[0];
        }
        return getSum(nums);
    }

    int getSum(int[] temp) {
        int size = temp.length;
        int res = 0;
        for (int i = 0; i < size; i++) {
            res += temp[i];
        }
        return res;
    }
}

public class LeetCode1005 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.largestSumAfterKNegations(new int[]{3,-1,0,2}, 3));

    }
}
