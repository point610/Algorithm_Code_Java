package CodeTop.HW2.HW1;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int size = nums.length;
        for (int i = 0; i < size; i++) {
            int current = nums[i];
            if (map.containsKey(target - current)) {
                return new int[]{map.get(target - current), i};
            } else {
                map.put(current, i);
            }
        }
        return null;
    }
}

public class HW1 {
}
