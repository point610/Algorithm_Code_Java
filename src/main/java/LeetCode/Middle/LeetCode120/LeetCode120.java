package LeetCode.Middle.LeetCode120;

import java.util.List;

/**
 * @ClassName LeetCode120
 * @Description TODO
 * @Author point
 * @Date 2023/11/7 22:37
 * @Version 1.0
 */
class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {

        int size = triangle.size();
        for (int i = 1; i < size; i++) {
            int tempsize = triangle.get(i).size();
            for (int j = 0; j < tempsize; j++) {
                if (j == 0) {
                    int value = triangle.get(i).get(j) + triangle.get(i - 1).get(j);
                    triangle.get(i).set(j, value);
                    continue;
                }
                if (j == tempsize - 1) {
                    int value = triangle.get(i).get(j) + triangle.get(i - 1).get(j - 1);
                    triangle.get(i).set(j, value);
                    continue;
                }
                int value = triangle.get(i).get(j) + Math.min(triangle.get(i - 1).get(j), triangle.get(i - 1).get(j - 1));
                triangle.get(i).set(j, value);
            }
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < triangle.get(size - 1).size(); i++) {
            min = Math.min(min, triangle.get(size - 1).get(i));
        }
        return min;

    }
}

public class LeetCode120 {
}
