package LeetCode.Easy.LeetCode2570;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName LeetCode2570
 * @Description TODO
 * @Author point
 * @Date 2023/10/1 11:19
 * @Version 1.0
 */
class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            map.put(nums1[i][0], map.getOrDefault(nums1[i][0], 0) + nums1[i][1]);
        }
        for (int i = 0; i < nums2.length; i++) {
            map.put(nums2[i][0], map.getOrDefault(nums2[i][0], 0) + nums2[i][1]);
        }
        int[][] arr = new int[map.size()][2];
        int index = 0;
        for (Integer key : map.keySet()) {
            arr[index][0] = key;
            arr[index][1] = map.get(key);
            index++;
        }
        Arrays.sort(arr, Comparator.comparingInt(o -> o[0]));
        return arr;
    }
}

public class LeetCode2570 {
}
