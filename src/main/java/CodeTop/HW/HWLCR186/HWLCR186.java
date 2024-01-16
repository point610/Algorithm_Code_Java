package CodeTop.HW.HWLCR186;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName HWLCR186
 * @Description TODO
 * @Author point
 * @Date 2023/12/24 15:20
 * @Version 1.0
 */
class Solution {
    public boolean checkDynasty(int[] places) {
        int count = 0;
        Set<Integer> set = new HashSet<>();
        for (int ii : places) {
            if (ii == 0) {
                count++;
            } else if (set.contains(ii)) {
                return false;
            } else {
                set.add(ii);
            }
        }

        Arrays.sort(places);
        int index = 0;
        while (places[index] == 0) {
            index++;
        }
        return count >= (places[places.length - 1] - places[index] + 1 - set.size());

    }
}

public class HWLCR186 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.checkDynasty(new int[]{0, 6, 9, 0, 7}));
        System.out.println(solution.checkDynasty(new int[]{7, 8, 9, 10, 11}));
        System.out.println(solution.checkDynasty(new int[]{0, 0, 2, 2, 5}));
    }
}
