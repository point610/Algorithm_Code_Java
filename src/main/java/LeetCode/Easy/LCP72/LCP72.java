package LeetCode.Easy.LCP72;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName LCP72
 * @Description TODO
 * @Author point
 * @Date 2023/10/4 19:26
 * @Version 1.0
 */
class Solution {
    public int[] supplyWagon(int[] supplies) {

        List<Integer> list = new ArrayList<>();
        int size = supplies.length;
        for (int i = 0; i < size; i++) {
            list.add(supplies[i]);
        }

        int remove = size - (int) Math.floor(size * 1.0 / 2);
        for (int i = 0; i < remove; i++) {
            int minindex = 0;
            int minsum = Integer.MAX_VALUE;
            for (int j = 0; j < list.size() - 1; j++) {
                if (list.get(j) + list.get(j + 1) < minsum) {
                    minsum = list.get(j) + list.get(j + 1);
                    minindex = j;
                }
            }
            // remove
            list.remove(minindex + 1);
            list.set(minindex, minsum);
        }
        return list.stream().mapToInt(Integer::valueOf).toArray();
    }
}

public class LCP72 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.supplyWagon(new int[]{1, 3, 1, 5});
    }
}
