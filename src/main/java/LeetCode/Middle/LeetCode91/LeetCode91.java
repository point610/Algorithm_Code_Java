package LeetCode.Middle.LeetCode91;

/**
 * @ClassName LeetCode91
 * @Description TODO
 * @Author point
 * @Date 2023/10/28 22:48
 * @Version 1.0
 */
class Solution {

    public int numDecodings(String s) {
        int size = s.length();
        int[] f = new int[size];
        for (int i = 0; i < size; i++) {
            if (i == 0) {
                if (s.charAt(i) == '0') {
                    return 0;
                }
                f[0] = 1;
                continue;
            }
            int a = s.charAt(i) - '0';
            int b = (s.charAt(i - 1) - '0') * 10 + (s.charAt(i) - '0');
            if (1 <= a && a <= 9) {
                f[i] = f[i - 1];
            }
            if (10 <= b && b <= 26) {
                if (i - 2 >= 0) {
                    f[i] += f[i - 2];
                }else {
                    f[i]++;
                }
            }

        }
        return f[size - 1];
    }
}

public class LeetCode91 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.numDecodings("12");
    }
}
