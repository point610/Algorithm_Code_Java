package LeetCode.Middle.LeetCode229;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        int size = nums.length / 3;
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Integer> list = new ArrayList<>();

        for (Integer key : map.keySet()) {
            if (map.get(key) > size) {
                list.add(key);
            }
        }

        return list;
    }
}

public class LeetCode229 {
}
