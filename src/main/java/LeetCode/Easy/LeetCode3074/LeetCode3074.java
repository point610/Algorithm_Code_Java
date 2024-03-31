package LeetCode.Easy.LeetCode3074;

import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int sum = 0;
        for (int i : apple) {
            sum += i;
        }
        Arrays.sort(capacity);
        int size = capacity.length;
        int number = 0;
        for (int i = size - 1; i >= 0 && sum > 0; i--) {
            number++;
            sum -= capacity[i];
        }
        return number;
    }
}

public class LeetCode3074 {
}
