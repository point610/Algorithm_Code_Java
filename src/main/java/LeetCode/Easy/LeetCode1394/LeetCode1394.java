package LeetCode.Easy.LeetCode1394;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName LeetCode1394
 * @Description TODO
 * @Author point
 * @Date 2023/9/18 22:10
 * @Version 1.0
 */
class Solution {
    public int findLucky(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        int max = 0;
        int times = -1;
        for (Integer key : map.keySet()) {
            if (key == map.get(key)) {
                if (key > max) {
                    max = key;
                    times = key;
                }
            }
        }
        return times;
    }
}

public class LeetCode1394 {
}
