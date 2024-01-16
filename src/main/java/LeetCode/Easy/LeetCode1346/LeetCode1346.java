package LeetCode.Easy.LeetCode1346;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName LeetCode1346
 * @Description TODO
 * @Author point
 * @Date 2023/9/17 11:09
 * @Version 1.0
 */
class Solution {
    public boolean checkIfExist(int[] arr) {
        int zeroNumber = 0;
        int size = arr.length;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < size; i++) {
            if (arr[i] == 0) {
                zeroNumber++;
            } else {
                set.add(arr[i]);
            }

        }
        if (zeroNumber >= 2) {
            return true;
        }
        for (int i = 0; i < size; i++) {
            if (set.contains(arr[i] * 2)) {
                return true;
            }
        }
        return false;

    }
}

public class LeetCode1346 {
}
