package CodeTop.HW.HW56;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @ClassName HW56
 * @Description TODO
 * @Author point
 * @Date 2023/12/25 19:36
 * @Version 1.0
 */
class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));
        List<int[]> list = new ArrayList<>();
        int left = intervals[0][0];
        int right = intervals[0][1];
        for (int[] ii : intervals) {
            if (right >= ii[0]) {
                right =Math.max(right, ii[1]);
            } else {
                list.add(new int[]{left, right});
                left = ii[0];
                right = ii[1];
            }
        }
        if (list.isEmpty()||list.get(list.size() - 1)[1] != intervals[intervals.length - 1][1]) {
            list.add(new int[]{left, right});
        }
        return list.toArray(new int[0][]);
    }
}

public class HW56 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.deepToString(solution.merge(new int[][]{{1, 4}, {4, 5}})));
    }
}
