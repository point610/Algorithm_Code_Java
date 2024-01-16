package LeetCode.Easy.LCR133;

/**
 * @ClassName LCR133
 * @Description TODO
 * @Author point
 * @Date 2023/10/9 11:30
 * @Version 1.0
 */
class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        String s = Integer.toBinaryString(n);
        int size = s.length();
        int one = 0;
        for (int i = 0; i < size; i++) {
            if (s.charAt(i) == '1') {
                one++;
            }
        }
        return one;
    }
}

public class LCR133 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.hammingWeight(-3));
    }
}
