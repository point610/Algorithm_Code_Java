package LeetCode.Easy.LeetCode1437;

/**
 * @ClassName LeetCode1437
 * @Description TODO
 * @Author point
 * @Date 2023/9/27 0:29
 * @Version 1.0
 */
class Solution {
    public boolean kLengthApart(int[] nums, int k) {

        int size = nums.length;
        int lastIndex = 0;
        // first xc1
        for (int i = 0; i < size; i++) {
            if (nums[i] == 1) {
                lastIndex = i;
                break;
            }
        }

        for (int i = lastIndex + 1; i < size; i++) {
            if (nums[i] == 1) {
                if ((i - lastIndex) > k) {
                    lastIndex = i;
                } else {
                    return false;
                }
            }

        }
        return true;
    }
}

public class LeetCode1437 {
}
