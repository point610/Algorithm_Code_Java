package LeetCode.Easy.LeetCode1619;

import java.util.Arrays;

/**
 * @ClassName LeetCode1619
 * @Description TODO
 * @Author point
 * @Date 2023/9/28 12:18
 * @Version 1.0
 */
class Solution {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        int size = arr.length;
        int removenumber = (int) (size * 0.05);
        double sum = 0;
        for (int i = removenumber; i < size - removenumber; i++) {
            sum += arr[i];
        }
        return sum / (size - 2 * removenumber);

    }
}

public class LeetCode1619 {
}
