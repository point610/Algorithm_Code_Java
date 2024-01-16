package LeetCode.Easy.LeetCode1560;

import java.util.*;

/**
 * @ClassName LeetCode1560
 * @Description TODO
 * @Author point
 * @Date 2023/9/27 23:59
 * @Version 1.0
 */
class Solution {
    public List<Integer> mostVisited(int n, int[] rounds) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(rounds[0] - 1, 1);
        int size = rounds.length;
        for (int i = 0; i < size - 1; i++) {
            int start = rounds[i] - 1;
            int end = rounds[i + 1] - 1;
            if (end <= start) {
                end += n;
            }
            for (int j = start + 1; j <= end; j++) {
                map.put(j % n, map.getOrDefault(j % n, 0) + 1);
            }
        }
        // find max
        int max = 0;
        for (Integer key : map.keySet()) {
            max = Math.max(max, map.get(key));
        }
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            if (map.containsKey(i) && map.get(i) == max) {
                list.add(i + 1);
            }
        }
        return list;

    }
}

public class LeetCode1560 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.mostVisited(4, new int[]{1, 3, 1, 2});
    }
}
