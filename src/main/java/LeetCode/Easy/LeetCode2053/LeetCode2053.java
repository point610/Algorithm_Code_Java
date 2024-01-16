package LeetCode.Easy.LeetCode2053;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName LeetCode2053
 * @Description TODO
 * @Author point
 * @Date 2023/9/30 11:12
 * @Version 1.0
 */
    class Solution {
        public String kthDistinct(String[] arr, int k) {
            Map<String, Integer> map = new HashMap<>();
            int size = arr.length;
            for (int i = 0; i < size; i++) {
                map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            }

            int times = 0;
            for (int i = 0; i < size; i++) {
                if (map.get(arr[i]) == 1) {
                    times++;
                    if (times == k) {
                        return arr[i];
                    }
                }

            }
            return "";

        }
    }

public class LeetCode2053 {
}
