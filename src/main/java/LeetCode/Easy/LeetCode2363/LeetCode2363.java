package LeetCode.Easy.LeetCode2363;

import java.util.*;

/**
 * @ClassName LeetCode2363
 * @Description TODO
 * @Author point
 * @Date 2023/10/1 15:40
 * @Version 1.0
 */
class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < items1.length; i++) {
            map.put(items1[i][0], map.getOrDefault(items1[i][0], 0) + items1[i][1]);
        }
        for (int i = 0; i < items2.length; i++) {
            map.put(items2[i][0], map.getOrDefault(items2[i][0], 0) + items2[i][1]);
        }
        List<List<Integer>> arr = new LinkedList<>();
        for (Integer key : map.keySet()) {
            List<Integer> temp = new LinkedList<>();
            temp.add(key);
            temp.add(map.get(key));
            arr.add(temp);
        }
        Collections.sort(arr, Comparator.comparingInt(o -> o.get(0)));
        return arr;
    }
}

public class LeetCode2363 {
}
