package CodeTop.TX.TX442;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int size = nums.length;

        for (int i = 0; i < size; i++) {
            nums[i]--;
        }

        // 将元素交换到对应的位置下标
        for (int i = 0; i < size; i++) {
            // 需要一直交换
            while (nums[i] != nums[nums[i]]) {
                swap(nums, i, nums[i]);
            }
        }

        for (int i = 0; i < size; i++) {
            if (nums[i] != i) {
                list.add(nums[i] + 1);
            }
        }

        return list;
    }

    private void swap(int[] nums, int one, int two) {
        int temp = nums[one];
        nums[one] = nums[two];
        nums[two] = temp;
    }
}

public class TX442 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.findDuplicates(new int[]{5, 4, 6, 7, 9, 3, 10, 9, 5, 6}));
        System.out.println(solution.findDuplicates(new int[]{4, 3, 2, 7, 8, 2, 3, 1}));
        System.out.println(solution.findDuplicates(new int[]{1, 1, 2}));
        System.out.println(solution.findDuplicates(new int[]{1}));
    }
}
