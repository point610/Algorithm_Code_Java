package LeetCode.Easy.LCR180;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName LCR180
 * @Description TODO
 * @Author point
 * @Date 2023/10/9 22:46
 * @Version 1.0
 */
class Solution {
    public int[][] fileCombination(int target) {
        List<int[]> list = new ArrayList<>();
        int sum = 0;
        int limit = (target - 1) / 2;
        for (int i = 1; i <= limit; i++) {
            for (int j = i; ; j++) {
                sum += j;
                if (sum > target) {
                    sum = 0;
                    break;
                } else if (sum == target) {
                    // add list
                    int[] temp = new int[j - i + 1];
                    for (int k = 0, l = i; k < j - i + 1; l++, k++) {
                        temp[k] = l;
                    }
                    list.add(temp);
                    sum = 0;
                    break;
                }
            }

        }
        return list.toArray(new int[list.size()][]);
    }
}

public class LCR180 {
}
