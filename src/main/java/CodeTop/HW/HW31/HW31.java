package CodeTop.HW.HW31;

import java.util.Arrays;

/**
 * @ClassName HW31
 * @Description TODO
 * @Author point
 * @Date 2023/12/27 21:58
 * @Version 1.0
 */
class Solution {
    public void nextPermutation(int[] nums) {
        boolean alldown = true;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] < nums[i]) {
                alldown = false;
                break;
            }
        }
        if (alldown) {
            for (int i = 0, j = nums.length - 1; i < j; i++, j--) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
            // System.out.println(Arrays.toString(nums));
            return;
        }

        int size = nums.length;
        int index = size - 1;
        while (nums[index - 1] >= nums[index]) {
            index--;
        }

        int tempnumber = nums[index - 1];
        int largemin = nums[index];
        int tempindex = index;
        for (int i = index; i < size; i++) {
            if (tempnumber < nums[i]) {
                if (largemin > nums[i]) {
                    largemin = nums[i];
                    tempindex = i;
                }
            }
        }

        // 交换
        nums[index - 1] = nums[tempindex];
        nums[tempindex] = tempnumber;

        // 排序
        Arrays.sort(nums, index, size );
        // System.out.println(Arrays.toString(nums));
    }
}

public class HW31 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.nextPermutation(new int[]{1, 3, 2});
        solution.nextPermutation(new int[]{1, 1});
        solution.nextPermutation(new int[]{1, 2, 3});
        solution.nextPermutation(new int[]{3, 2, 1});
        solution.nextPermutation(new int[]{1, 1, 5});
    }
}
