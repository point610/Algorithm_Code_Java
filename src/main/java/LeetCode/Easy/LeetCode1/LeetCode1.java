package LeetCode.Easy.LeetCode1;

import java.util.Arrays;

/**
 * @ClassName LeetCode1
 * @Description TODO
 * @Author point
 * @Date 2023/7/13 22:21
 * @Version 1.0
 */
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int size = nums.length;
        int[] real = nums.clone();
        Arrays.sort(nums);
        int one = -1;
        int two = -1;
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (nums[i] + nums[j] == target) {
                    for (int k = 0; k < size; k++) {
                        if (real[k] == nums[i] && one == -1) {
                            one = k;
                        }
                        if (real[k] == nums[j] && k != one) {
                            two = k;
                        }
                    }
                    return new int[]{one, two};
                }
                if (nums[i] + nums[j] > target) {
                    break;
                }
            }
        }

        return new int[]{0, 0};
    }
}

public class LeetCode1 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] ints = solution.twoSum(new int[]{2, 5, 5, 11}, 10);
        System.out.println(ints[0]);
        System.out.println(ints[1]);

    }
}
