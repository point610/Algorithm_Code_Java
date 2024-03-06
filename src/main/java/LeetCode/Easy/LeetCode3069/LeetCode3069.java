package LeetCode.Easy.LeetCode3069;

import java.util.Arrays;

class Solution {
    public int[] resultArray(int[] nums) {
        int[] list = new int[nums.length];
        int left = 0;
        int right = nums.length - 1;
        list[left++] = nums[0];
        list[right--] = nums[1];
        for (int i = 2; i < nums.length; i++) {
            int temp = nums[i];
            if (list[left - 1] > list[right + 1]) {
                list[left++] = temp;
            } else {
                list[right--] = temp;
            }
        }
        change(list, right + 1);
        return list;
    }

    private void change(int[] nums, int index) {
        for (int i = index, j = nums.length - 1; i < j; i++, j--) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }
}

public class LeetCode3069 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.resultArray(new int[]{2, 1, 3})));
        System.out.println(Arrays.toString(solution.resultArray(new int[]{5,4,3,8})));
    }
}
