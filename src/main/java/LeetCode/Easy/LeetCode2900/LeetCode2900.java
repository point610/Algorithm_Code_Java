package LeetCode.Easy.LeetCode2900;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> getLongestSubsequence(int[] groups) {
        List<Integer> list = new ArrayList<>();

        int size = groups.length;
        for (int i = 0; i < size; i++) {
            if (i == size - 1 || groups[i] != groups[i + 1]) {
                list.add(i);
            }
        }

        return list;
    }
}

public class LeetCode2900 {
}
