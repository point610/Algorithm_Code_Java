package CodeTop.HW2.HW905;

import java.util.Arrays;

class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {

            while (left < right && nums[left] % 2 == 0) {
                left++;
            }
            if (left == right) {
                break;
            }
            while (left < right && nums[right] % 2 == 1) {
                right--;
            }
            if (left == right) {
                break;
            }
            swap(nums, left, right);

        }

        return nums;
    }

    private void swap(int[] nums, int one, int two) {
        int temp = nums[one];
        nums[one] = nums[two];
        nums[two] = temp;
    }
}

public class HW905 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.sortArrayByParity(new int[]{3, 1, 2, 4})));
        System.out.println(Arrays.toString(solution.sortArrayByParity(new int[]{0})));
    }
}
