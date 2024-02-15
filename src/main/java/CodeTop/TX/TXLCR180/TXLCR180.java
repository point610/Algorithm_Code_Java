package CodeTop.TX.TXLCR180;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[][] fileCombination(int target) {
        int left = 1;
        int right = 1;
        List<int[]> list = new ArrayList<>();

        int sum = 0;
        while (left < target / 2 + 1) {
            if (sum == target) {
                list.add(getarr(left, right));
                sum -= left;
                left++;
            } else if (sum < target) {
                sum += right;
                right++;
            } else {
                sum -= left;
                left++;
            }
        }

        return list.toArray(new int[list.size()][]);
    }

    private int[] getarr(int left, int right) {
        int[] lll = new int[right - left];
        for (int i = left, j = 0; i < right; j++, i++) {
            lll[j] = i;
        }
        return lll;
    }
}

public class TXLCR180 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.deepToString(solution.fileCombination(12)));
        System.out.println(Arrays.deepToString(solution.fileCombination(18)));
    }
}
