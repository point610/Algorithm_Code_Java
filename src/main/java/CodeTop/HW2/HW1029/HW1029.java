package CodeTop.HW2.HW1029;

import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int twoCitySchedCost(int[][] costs) {
        Arrays.sort(costs, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                int one = o1[0] - o1[1];
                int two = o2[0] - o2[1];

                return one - two;
            }
        });

        int res = 0;

        int left = 0;
        int right = costs.length - 1;
        while (left < right) {
            res += costs[left++][0];
            res += costs[right--][1];
        }

        return res;
    }
}

public class HW1029 {
}
