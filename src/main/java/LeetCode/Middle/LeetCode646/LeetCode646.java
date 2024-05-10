package LeetCode.Middle.LeetCode646;

import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, Comparator.comparingInt(a -> a[1]));
        int count = 0;
        int index = Integer.MIN_VALUE;
        for (int[] pair : pairs) {
            if (index < pair[0]) {
                count++;
                index = pair[1];
            }
        }
        return count;

    }
}

public class LeetCode646 {
}
