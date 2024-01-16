package LeetCode.Easy.LeetCode2595;

/**
 * @ClassName LeetCode2595
 * @Description TODO
 * @Author point
 * @Date 2023/10/3 11:57
 * @Version 1.0
 */
class Solution {
    public int[] evenOddBit(int n) {
        // 用 even 表示在 n 的二进制形式（下标从 0 开始）中值为 1 的偶数下标的个数。
        //
        // 用 odd 表示在 n 的二进制形式（下标从 0 开始）中值为 1 的奇数下标的个数。
        //
        // 返回整数数组 answer ，其中 answer = [even, odd] 。
        int even = 0;
        int odd = 0;
        String s = new StringBuffer(Integer.toBinaryString(n)).reverse().toString();
        int size = s.length();
        for (int i = 0; i < size; i++) {
            if (i % 2 == 0) {
                if (s.charAt(i) == '1') {
                    even++;
                }
            } else {
                if (s.charAt(i) == '1') {
                    odd++;
                }

            }
        }
        return new int[]{even, odd};
    }
}

public class LeetCode2595 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.evenOddBit(2);
    }
}
