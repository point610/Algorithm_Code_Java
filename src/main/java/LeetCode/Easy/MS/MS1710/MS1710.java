package LeetCode.Easy.MS.MS1710;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName MS1710
 * @Description TODO
 * @Author point
 * @Date 2023/10/12 15:59
 * @Version 1.0
 */
class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int size = nums.length;
        for (int i = 0; i < size; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        for (Integer key : map.keySet()) {
            if (map.get(key) > size / 2) {
                return key;
            }
        }
        return -1;

    }
}

public class MS1710 {
}
