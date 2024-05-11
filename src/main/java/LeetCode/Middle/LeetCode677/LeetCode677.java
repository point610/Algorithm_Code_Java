package LeetCode.Middle.LeetCode677;

import java.util.HashMap;
import java.util.Map;

class MapSum {
    private Map<String, Integer> map;

    public MapSum() {
        map = new HashMap<>();
    }

    public void insert(String key, int val) {
        map.put(key, val);
    }

    public int sum(String prefix) {
        int res = 0;
        for (String key : map.keySet()) {
            if (key.startsWith(prefix)) {
                res += map.get(key);
            }
        }

        return res;
    }
}

/**
 * Your MapSum object will be instantiated and called as such:
 * MapSum obj = new MapSum();
 * obj.insert(key,val);
 * int param_2 = obj.sum(prefix);
 */
public class LeetCode677 {
}
