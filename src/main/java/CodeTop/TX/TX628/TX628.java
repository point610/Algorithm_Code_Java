package CodeTop.TX.TX628;

import java.util.Arrays;

class Solution {
    public int maximumProduct(int[] nums) {
        int size = nums.length;
        Arrays.sort(nums);
        int fushu = 0;
        for (int i = 0; i < size; i++) {
            if (nums[i] < 0) {
                fushu++;
            } else {
                break;
            }
        }

        if (fushu >= 2) {
            return Math.max(nums[size - 1] * nums[size - 2] * nums[size - 3], nums[0] * nums[1] * nums[size - 3]);
        } else {
            return nums[size - 1] * nums[size - 2] * nums[size - 3];
        }

    }
}

public class TX628 {
}
