package CodeTop.HW2.HWLCR180;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[][] fileCombination(int target) {

        List<int[]> list = new ArrayList<>();

        int left = 1;
        int right = 2;
        int sum = 1;
        int end = target / 2 + 1;
        while (left < end) {

            if (sum == target) {
                list.add(getlist(left, right - 1));
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

    private int[] getlist(int one, int two) {
        int[] temp = new int[two - one + 1];
        for (int i = one, j = 0; i <= two; j++, i++) {
            temp[j] = i;
        }
        return temp;
    }
}

public class HWLCR180 {
    public static void main(String[] args) {
    }}
