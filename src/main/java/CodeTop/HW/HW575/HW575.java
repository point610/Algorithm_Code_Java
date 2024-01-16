package CodeTop.HW.HW575;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName HW575
 * @Description TODO
 * @Author point
 * @Date 2023/12/23 21:51
 * @Version 1.0
 */
class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> set = new HashSet<>();
        for (Integer ii : candyType) {
            set.add(ii);
        }
        return Math.min(set.size(), candyType.length / 2);
    }
}

public class HW575 {
    public static void main(String[] args) {
        Solution solution =
                new Solution();
        System.out.println(solution.distributeCandies(new int[]{
                1, 1, 2, 2, 3, 3
        }));
        System.out.println(solution.distributeCandies(new int[]{
                1, 1, 2, 3
        }));
        System.out.println(solution.distributeCandies(new int[]{
                6, 6, 6, 6
        }));
    }
}
