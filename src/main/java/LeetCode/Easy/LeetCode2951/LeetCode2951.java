package LeetCode.Easy.LeetCode2951;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findPeaks(int[] mountain) {
        int size = mountain.length;
        List<Integer> ll = new ArrayList<>();
        for (int i = 1; i < size - 1; i++) {
            if (is(mountain[i - 1], mountain[i], mountain[i + 1])) {
                ll.add(i);
            }
        }
        return ll;
    }

    private boolean is(int a, int b, int c) {
        return a < b && b > c;
    }
}

public class LeetCode2951 {
}
