package LeetCode.Easy.LeetCode1848;

/**
 * @ClassName LeetCode1848
 * @Description TODO
 * @Author point
 * @Date 2023/9/29 0:42
 * @Version 1.0
 */
class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        if (nums[start] == target) {
            return 0;
        }

        int left = start - 1;
        int right = start + 1;
        while (0 <= left) {
            if (nums[left] == target) {
                break;
            }
            left--;
        }
        int size = nums.length;
        while (right < size) {
            if (nums[right] == target) {
                break;
            }
            right++;
        }
        if (0 > left) {
            return right - start;
        }
        if (size <= right) {
            return start - left;
        }
        return Math.min(start - left, right - start);

    }
}

public class LeetCode1848 {
}
