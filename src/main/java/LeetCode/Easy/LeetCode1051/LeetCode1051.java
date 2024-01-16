package LeetCode.Easy.LeetCode1051;

import java.util.Arrays;

/**
 * @ClassName LeetCode1051
 * @Description TODO
 * @Author point
 * @Date 2023/8/18 16:41
 * @Version 1.0
 */
class Solution {
    public int heightChecker(int[] heights) {
        int size = heights.length;
        int[] temp = new int[size];
        for (int i = 0; i < size; i++) {
            temp[i] = heights[i];
        }
        Arrays.sort(heights);
        int sum = 0;
        for (int i = 0; i < size; i++) {
            if (heights[i] != temp[i]){
                sum++;
            }
        }
        return sum;
    }
}

public class LeetCode1051 {
}
