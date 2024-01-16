package LeetCode.Easy.LeetCode1403;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName LeetCode1403
 * @Description TODO
 * @Author point
 * @Date 2023/9/24 23:48
 * @Version 1.0
 */
class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        int size = nums.length;
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += nums[i];
        }
        int temp = 0;
        for (int i = size - 1; i >= 0; i--) {
            list.add(nums[i]);
            temp += nums[i];
            if (temp > (sum / 2)) {
                break;
            }
        }
        return list;

    }
}

public class LeetCode1403 {
}
