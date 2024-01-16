package LeetCode.Middle.LeetCode137;


import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName LeetCode137
 * @Description TODO
 * @Author point
 * @Date 2023/11/11 22:50
 * @Version 1.0
 */
class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int size = nums.length;
        for (int i = 0; i < size; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        for (Integer key : map.keySet()) {
            if (map.get(key) == 1) {
                return key;
            }
        }
        return 0;
    }
}

public class LeetCode137 {
}
