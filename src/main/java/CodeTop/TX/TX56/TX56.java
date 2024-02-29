package CodeTop.TX.TX56;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> list = new ArrayList<>();

        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });

        int left = intervals[0][0];
        int right = intervals[0][1];

        int size = intervals.length;
        for (int i = 1; i < size; i++) {
            if (right < intervals[i][0]) {
                list.add(new int[]{left, right});
                left = intervals[i][0];
                right = intervals[i][1];
            } else if (intervals[i][0] <= right && right <= intervals[i][1]) {
                right = intervals[i][1];
            } else {

            }
        }

        list.add(new int[]{left, right});

        return list.toArray(new int[0][]);
    }
}

public class TX56 {

}
