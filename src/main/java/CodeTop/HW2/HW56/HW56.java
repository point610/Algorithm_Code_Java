package CodeTop.HW2.HW56;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });

        List<int[]> list = new ArrayList<>();

        int left = intervals[0][0];
        int right = intervals[0][1];

        for (int i = 0; i < intervals.length; i++) {
            int one = intervals[i][0];
            int two = intervals[i][1];
            if (i == intervals.length - 1) {
                if (right < one) {
                    list.add(new int[]{left, right});
                    left = one;
                    right = two;
                    list.add(new int[]{left, right});
                } else if (one <= right && right <= two) {
                    right = two;
                    list.add(new int[]{left, right});
                } else if (two < right) {
                    list.add(new int[]{left, right});
                }
            } else {
                if (right < one) {
                    list.add(new int[]{left, right});
                    left = one;
                    right = two;
                } else if (one <= right && right <= two) {
                    right = two;
                } else if (two < right) {

                }
            }
        }


        return list.toArray(new int[list.size()][]);

    }
}

public class HW56 {
}
