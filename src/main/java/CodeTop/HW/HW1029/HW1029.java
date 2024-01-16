package CodeTop.HW.HW1029;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @ClassName HW1029
 * @Description TODO
 * @Author point
 * @Date 2023/12/24 19:26
 * @Version 1.0
 */
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

        int sum = 0;
        int size = costs.length / 2;
        for (int i = 0; i < size; i++) {
            sum += (costs[i][0] + costs[i + size][1]);
        }
        return sum;
    }
}

public class HW1029 {
    public static void main(String[] args) {
    }
}
