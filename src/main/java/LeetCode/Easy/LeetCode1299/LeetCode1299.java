package LeetCode.Easy.LeetCode1299;

/**
 * @ClassName LeetCode1299
 * @Description TODO
 * @Author point
 * @Date 2023/9/17 9:07
 * @Version 1.0
 */
class Solution {
    public int[] replaceElements(int[] arr) {
        int size = arr.length;
        for (int i = 0; i < size - 1; i++) {
            arr[i] = getMax(i + 1, arr);
        }
        arr[size - 1] = -1;
        return arr;
    }

    private int getMax(int i, int[] arr) {
        int max = 0;
        int size = arr.length;
        for (int j = i; j < size; j++) {
            max = Math.max(max, arr[j]);
        }
        return max;
    }
}

public class LeetCode1299 {
}
