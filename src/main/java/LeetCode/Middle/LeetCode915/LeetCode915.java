package LeetCode.Middle.LeetCode915;

class Solution {
    public int partitionDisjoint(int[] nums) {

        int size = nums.length;
        int[] min = new int[size];
        int[] max = new int[size];

        max[0] = nums[0];
        min[size - 1] = nums[size - 1];
        for (int i = 1; i < size; i++) {
            max[i] = Math.max(max[i - 1], nums[i]);
        }
        for (int i = size - 2; i >= 0; i--) {
            min[i] = Math.min(min[i + 1], nums[i]);
        }


        for (int i = 0; i < size - 1; i++) {
            if (max[i] <= min[i + 1]) {
                return i + 1;
            }
        }
        return size;
    }
}

public class LeetCode915 {
}
