package LeetCode.Easy.LeetCode1436;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName LeetCode1436
 * @Description TODO
 * @Author point
 * @Date 2023/9/27 0:26
 * @Version 1.0
 */
class Solution {
    public String destCity(List<List<String>> paths) {
        Map<String, String> map = new HashMap<>();
        int size = paths.size();
        for (int i = 0; i < size; i++) {
            map.put(paths.get(i).get(0), paths.get(i).get(1));
        }
        String current = paths.get(0).get(0);
        while (true) {
            if (!map.containsKey(current)) {
                return current;
            }
            current = map.get(current);
        }

    }
}

public class LeetCode1436 {
}
