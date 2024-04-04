package LeetCode.Middle.LeetCode274;

import java.util.Arrays;

class Solution {
    public int hIndex(int[] citations) {
        int size = citations.length;

        Arrays.sort(citations);
        for (int i = 0; i < size; i++) {
            if (citations[i] >= size - i) {
                return size - i;
            }
        }
        return 0;
    }

}

public class LeetCode274 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.hIndex(new int[]{3, 0, 6, 1, 5}));
        System.out.println(solution.hIndex(new int[]{1, 3, 1}));
    }
}
