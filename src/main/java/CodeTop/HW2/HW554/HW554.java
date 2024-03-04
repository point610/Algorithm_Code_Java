package CodeTop.HW2.HW554;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public int leastBricks(List<List<Integer>> wall) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < wall.size(); i++) {
            int sum = 0;
            for (int j = 0; j < wall.get(i).size() - 1; j++) {
                sum += wall.get(i).get(j);
                map.put(sum, map.getOrDefault(sum, 0) + 1);
            }
        }

        int max = 0;
        for (int key : map.keySet()) {
            max = Math.max(max, map.get(key));
        }
        return wall.size() - max;
    }
}

public class HW554 {
}
