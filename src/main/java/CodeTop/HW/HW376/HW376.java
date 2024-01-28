package CodeTop.HW.HW376;

class Solution {
    public int wiggleMaxLength(int[] nums) {
        int size = nums.length;
        if (size == 0) {
            return 0;
        }

        int up = 0;
        int down = 0;

        for (int i = 1; i < size; i++) {
            if (nums[i - 1] < nums[i]) {
                up = down + 1;
            } else if (nums[i - 1] > nums[i]) {
                down = up + 1;
            }
        }

        // 使用for循环统计的是次数，返回的是个数
        return Math.max(up, down) + 1;
    }
}

public class HW376 {
}
