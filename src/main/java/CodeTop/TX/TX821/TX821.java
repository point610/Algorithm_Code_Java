package CodeTop.TX.TX821;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] shortestToChar(String s, char c) {
        int size = s.length();
        List<Integer> indexes = new ArrayList<>();
        // 找indexes
        for (int i = 0; i < size; i++) {
            if (s.charAt(i) == c) {
                indexes.add(i);
            }
        }
        int cindex = 0;
        indexes.add(10000000);
        int[] res = new int[size];

        for (int i = 0; i < size; i++) {
            res[i] = Math.min(Math.abs(indexes.get(cindex) - i), Math.abs(indexes.get(cindex + 1) - i));
            if (indexes.get(cindex + 1) == i) {
                cindex++;
            }
        }

        return res;
    }
}

public class TX821 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.shortestToChar("loveleetcode", 'e')));
        System.out.println(Arrays.toString(solution.shortestToChar("aaab", 'b')));
    }
}
