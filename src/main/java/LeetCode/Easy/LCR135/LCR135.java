package LeetCode.Easy.LCR135;

/**
 * @ClassName LCR135
 * @Description TODO
 * @Author point
 * @Date 2023/10/4 21:07
 * @Version 1.0
 */
class Solution {
    public int[] countNumbers(int cnt) {
        int number = (int) Math.pow(10, cnt) - 1;
        int[] list = new int[number];
        for (int i = 1; i <= number; i++) {
            list[i - 1] = i;
        }
        return list;
    }
}

public class LCR135 {
}
