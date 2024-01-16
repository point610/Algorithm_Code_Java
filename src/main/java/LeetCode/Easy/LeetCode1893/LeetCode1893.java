package LeetCode.Easy.LeetCode1893;

import java.util.HashMap;

/**
 * @ClassName LeetCode1893
 * @Description TODO
 * @Author point
 * @Date 2023/8/11 21:33
 * @Version 1.0
 */
class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
        int size = ranges.length;
        int min = 100;
        int max = 0;
        for (int i = 0; i < size; i++) {
            max = Math.max(Math.max(max, ranges[i][1]), ranges[i][0]);
            min = Math.min(Math.min(min, ranges[i][1]), ranges[i][0]);
        }

        if (min > right || max < left) {
            return false;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = left; i <= right; i++) {
            map.put(i, 1);
        }

        for (int i = 0; i < size; i++) {
            if (ranges[i][0] > right || ranges[i][1] < left) {
                continue;
            }

            for (int j = ranges[i][0]; j <= ranges[i][1]; j++) {
                if (map.containsKey(j)) {
                    map.put(j, 0);
                }
            }
        }
        // 对map进行校验
        for (Integer key : map.keySet()) {
            if (map.get(key) > 0) {
                return false;
            }
        }
        return true;
    }
}

public class LeetCode1893 {
    public static void main(String[] args) {
    }
}
