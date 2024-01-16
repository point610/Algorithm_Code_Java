package LeetCode.Middle.LeetCode435;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @ClassName LeetCode435
 * @Description TODO
 * @Author point
 * @Date 2023/8/3 23:40
 * @Version 1.0
 */
class Solution {
    Comparator<int[]> comparator = (a, b) -> Integer.compare(a[1], b[1]);


    public int eraseOverlapIntervals(int[][] intervals) {
        int row = intervals.length;
        Arrays.sort(intervals, comparator);

        int sum = 1;
        int index = intervals[0][1];
        for (int i = 0; i < row; i++) {
            if (index <= intervals[i][0]) {
                index = intervals[i][1];
                sum++;
            }
        }
        return row - sum;
    }
}

public class LeetCode435 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.eraseOverlapIntervals(new int[][]{{1, 2}, {2, 3}, {3, 4}, {1, 3}}));

    }
}
