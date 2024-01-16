package LeetCode.Easy.LCP77;

import java.util.Arrays;

/**
 * @ClassName LCP77
 * @Description TODO
 * @Author point
 * @Date 2023/10/5 13:25
 * @Version 1.0
 */
class Solution {
    public int runeReserve(int[] runes) {
        int size = runes.length;
        if (size == 1) {
            return 1;
        }
        Arrays.sort(runes);
        int max = 0;
        for (int i = 0; i < size - 1; i++) {
            int tempmax = 1;
            while (i < size - 1 && Math.abs(runes[i] - runes[i + 1]) <= 1) {
                tempmax++;
                i++;
            }
            max = Math.max(max, tempmax);

        }
        return max;
    }
}

public class LCP77 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.runeReserve(new int[]{1, 1, 3, 3, 2, 4}));
    }
}
