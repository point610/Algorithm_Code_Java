package CodeTop.HW.HW280;

import java.util.Arrays;

class Solution {
    public void wiggleSort(int[] nums) {
        Arrays.sort(nums);
        int size = nums.length;
        for (int i = 2; i < size; i+=2) {
            int temp = nums[i];
            nums[i] = nums[i - 1];
            nums[i - 1] = temp;
        }
    }
}

public class HW280 {
}
