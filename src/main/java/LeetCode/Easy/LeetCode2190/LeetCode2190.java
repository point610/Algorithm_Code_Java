package LeetCode.Easy.LeetCode2190;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName LeetCode2190
 * @Description TODO
 * @Author point
 * @Date 2023/9/30 19:40
 * @Version 1.0
 */
class Solution {
    public int mostFrequent(int[] nums, int key) {
        int size = nums.length;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < size - 1; i++) {
            if (nums[i] == key) {
                map.put(nums[i + 1], map.getOrDefault(nums[i + 1], 0) + 1);
            }
        }
        // count
        int max = 0;
        int number = 0;
        for (Integer kkk : map.keySet()) {
            if (max < map.get(kkk)) {
                max = map.get(kkk);
                number = kkk;
            }
        }
        return number;

    }
}

public class LeetCode2190 {
}
