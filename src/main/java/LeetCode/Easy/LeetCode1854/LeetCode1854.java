package LeetCode.Easy.LeetCode1854;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName LeetCode1854
 * @Description TODO
 * @Author point
 * @Date 2023/9/29 0:48
 * @Version 1.0
 */
class Solution {
    public int maximumPopulation(int[][] logs) {
        Map<Integer, Integer> map = new HashMap<>();
        int size = logs.length;
        for (int i = 0; i < size; i++) {
            for (int j = logs[i][0]; j < logs[i][1]; j++) {
                map.put(j, map.getOrDefault(j, 0) + 1);
            }
        }

        int maxyear = 900000;
        int max = 0;
        for (Integer key : map.keySet()) {
            if (map.get(key) > max) {
                max = map.get(key);
                maxyear = key;
            } else if (map.get(key) == max) {
                maxyear = Math.min(maxyear,key);
            }
        }
        return maxyear;
    }
}

public class LeetCode1854 {
}
