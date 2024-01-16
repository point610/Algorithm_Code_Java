package LeetCode.Easy.LeetCode896;

/**
 * @ClassName LeetCode896
 * @Description TODO
 * @Author point
 * @Date 2023/8/12 1:00
 * @Version 1.0
 */
class Solution {
    public boolean isMonotonic(int[] nums) {
        int size = nums.length;
        if (size == 1 || size == 2) {
            return true;
        }
        int index = 1;
        while (index < size && nums[index] == nums[index - 1]) {
            index++;
        }
        if (index == size) {
            return true;
        }

        if (nums[index - 1] < nums[index]) {
            for (int i = index; i < size; i++) {
                if (nums[i - 1] > nums[i]) {
                    return false;
                }
            }
        } else {
            for (int i = index; i < size; i++) {
                if (nums[i - 1] < nums[i]) {
                    return false;
                }
            }
        }
        return true;

    }
}

public class LeetCode896 {
}
