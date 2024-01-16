package LeetCode.Easy.LeetCode1200;

import java.util.*;

/**
 * @ClassName LeetCode1200
 * @Description TODO
 * @Author point
 * @Date 2023/8/18 23:29
 * @Version 1.0
 */
class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);

        int step = 10000000;
        int size = arr.length;
        for (int i = 1; i < size; i++) {
            step = Math.min(step, arr[i] - arr[i - 1]);
        }

        // 将结果集合
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 1; i < size; i++) {
            if (arr[i] - arr[i - 1] == step) {
                List<Integer> temp = new ArrayList<>();
                temp.add(arr[i - 1]);
                temp.add(arr[i]);
                list.add(temp);
            }
        }
        return list;

    }
}

public class LeetCode1200 {
}
