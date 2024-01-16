package LeetCode.Easy.LeetCode1725;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName v
 * @Description TODO
 * @Author point
 * @Date 2023/9/28 16:30
 * @Version 1.0
 */
class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        Map<Integer, Integer> map = new HashMap<>();
        int size = rectangles.length;

        int max = 0;
        for (int i = 0; i < size; i++) {
            int min = Math.min(rectangles[i][0], rectangles[i][1]);
            max = Math.max(max, min);
            map.put(min, map.getOrDefault(min, 0) + 1);
        }


        return map.get(max);

    }
}

public class LeetCode1725 {
}
