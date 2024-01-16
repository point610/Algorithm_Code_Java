package LeetCode.Middle.LeetCode10_11;

/**
 * @ClassName LeetCode10_11
 * @Description TODO
 * @Author point
 * @Date 2023/8/12 0:16
 * @Version 1.0
 */
class Solution {
    public void wiggleSort(int[] nums) {
        int size = nums.length;
        for (int i = 1; i < size; i++) {
            if (i % 2 == 0) {
                // 为峰
                if (nums[i - 1] > nums[i]) {
                    int temp = nums[i ];
                    nums[i] = nums[i - 1];
                    nums[i - 1] = temp;
                }
            } else {
                // 为谷
                if (nums[i - 1] < nums[i]) {
                    int temp = nums[i ];
                    nums[i] = nums[i - 1];
                    nums[i - 1] = temp;
                }
            }
        }
    }
}

public class LeetCode10_11 {
}
