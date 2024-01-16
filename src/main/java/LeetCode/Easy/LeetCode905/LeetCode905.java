package LeetCode.Easy.LeetCode905;

/**
 * @ClassName LeetCode905
 * @Description TODO
 * @Author point
 * @Date 2023/8/12 16:19
 * @Version 1.0
 */
    class Solution {
        public int[] sortArrayByParity(int[] nums) {
            int size = nums.length;
            if (size == 1) {
                return nums;
            }

            int leftIndex = 0;
            int rightIndex = size - 1;
            while (leftIndex < rightIndex) {
                while (leftIndex < rightIndex && nums[leftIndex] % 2 == 0) {
                    leftIndex++;
                }
                while (leftIndex < rightIndex && nums[rightIndex] % 2 == 1) {
                    rightIndex--;
                }
                int temp = nums[leftIndex];
                nums[leftIndex] = nums[rightIndex];
                nums[rightIndex] = temp;

            }
            return nums;
        }
    }

public class LeetCode905 {
}
