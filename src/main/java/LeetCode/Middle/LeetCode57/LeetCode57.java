package LeetCode.Middle.LeetCode57;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName LeetCode57
 * @Description TODO
 * @Author point
 * @Date 2023/10/25 22:43
 * @Version 1.0
 */
class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> list = new ArrayList<>();
        int size = intervals.length;
        int left = newInterval[0];
        int right = newInterval[1];
        int i = 0;
        // left
        for (; i < size; i++) {
            if (left <= intervals[i][0]) {
                break;
            }
            if (left <= intervals[i][1]) {
                left = intervals[i][0];
                break;
            }
            list.add(intervals[i]);
        }
        // right
        for (; i < size; i++) {
            if (right < intervals[i][0]) {
                break;
            }
            if (right <= intervals[i][1]) {
                right = intervals[i][1];
                i++;
                break;
            }
        }
        list.add(new int[]{left, right});
        // retain
        for (; i < size; i++) {
            list.add(intervals[i]);
        }
        return list.toArray(new int[0][]);
    }
}

public class LeetCode57 {
}
