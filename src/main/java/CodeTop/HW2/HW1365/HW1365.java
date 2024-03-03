package CodeTop.HW2.HW1365;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int size = nums.length;
        int[] order = Arrays.copyOf(nums, size);

        Arrays.sort(order);
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < size; i++) {
            if (!map.containsKey(order[i])) {
                map.put(order[i], i);
            }
        }

        for (int i = 0; i < size; i++) {
            nums[i] = map.get(nums[i]);
        }
        return nums;
    }
}

public class HW1365 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.smallerNumbersThanCurrent(new int[]{8, 1, 2, 2, 3})));
        System.out.println(Arrays.toString(solution.smallerNumbersThanCurrent(new int[]{6, 5, 4, 8})));
        System.out.println(Arrays.toString(solution.smallerNumbersThanCurrent(new int[]{7, 7, 7, 7})));
    }
}
