package LeetCode.Easy.LeetCode1331;

import java.util.*;

/**
 * @ClassName LeetCode1331
 * @Description TODO
 * @Author point
 * @Date 2023/9/17 10:13
 * @Version 1.0
 */
class Solution {
    public int[] arrayRankTransform(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        int size = arr.length;
        int[] order = new int[size];
        System.arraycopy(arr, 0, order, 0, size);
        Arrays.sort(order);
        for (int i = 0; i < size; i++) {
            if (!map.containsKey(order[i])) {
                map.put(order[i], map.size() + 1);
            }
        }
        int[] res = new int[size];
        for (int i = 0; i < size; i++) {
            res[i] = map.get(arr[i]);
        }
        return res;

    }
}

public class LeetCode1331 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.arrayRankTransform(new int[]{37, 12, 28, 9, 100, 56, 80, 5, 12});
    }
}
