package LeetCode.Easy.LCR003;

/**
 * @ClassName LCR003
 * @Description TODO
 * @Author point
 * @Date 2023/10/7 21:05
 * @Version 1.0
 */
class Solution {
    int getonenumber(int n) {
        String s =Integer.toBinaryString(n);
        int size = s.length();
        int one = 0;
        for (int i = 0; i < size; i++) {
            if (s.charAt(i) == '1') {
                one++;
            }
        }
        return one;
    }

    public int[] countBits(int n) {
        int[] arr = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = getonenumber(i);
        }
        return arr;
    }
}

public class LCR003 {
}
