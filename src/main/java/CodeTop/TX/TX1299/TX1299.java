package CodeTop.TX.TX1299;

import java.util.Arrays;

class Solution {
    public int[] replaceElements(int[] arr) {
        int size = arr.length;
        int[] res = new int[size];
        res[size - 1] = -1;
        int max = arr[size - 1];
        for (int i = size - 2; i >= 0; i--) {
            res[i] = max;
            max = Math.max(max, arr[i]);
        }
        return res;
    }
}

public class TX1299 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.replaceElements(new int[]{17, 18, 5, 4, 6, 1})));
        System.out.println(Arrays.toString(solution.replaceElements(new int[]{400})));
    }
}
