package LeetCode.Easy.LeetCode1207;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName LeetCode1207
 * @Description TODO
 * @Author point
 * @Date 2023/8/18 23:33
 * @Version 1.0
 */
class Solution {
    int STEP = 1000;

    public boolean uniqueOccurrences(int[] arr) {
        int[] list = new int[2001];
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            list[arr[i] + STEP]++;
        }

        // 最后进行遍历
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i <= 2000; i++) {
            if (list[i] > 0) {
                if (set.contains(list[i])) {
                    return false;
                }
                set.add(list[i]);
            }
        }

        return true;
    }
}

public class LeetCode1207 {
}
