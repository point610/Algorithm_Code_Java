package CodeTop.HW.HW283;

/**
 * @ClassName HW283
 * @Description TODO
 * @Author point
 * @Date 2023/12/24 17:12
 * @Version 1.0
 */
    class Solution {
        public void moveZeroes(int[] nums) {
            int size = nums.length;
            for (int i = size - 1; i >= 0; i--) {
                if (nums[i] == 0) {
                    for (int j = i; j < size - 1; j++) {
                        int temp = nums[j];
                        nums[j] = nums[j + 1];
                        nums[j + 1] = temp;
                    }
                }
            }
        }
    }

public class HW283 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.moveZeroes(new int[]{0, 0, 1});
    }
}
