package LeetCode.Easy.LeetCode2544;

/**
 * @ClassName LeetCode2544
 * @Description TODO
 * @Author point
 * @Date 2023/10/3 11:19
 * @Version 1.0
 */
class Solution {
    public int alternateDigitSum(int n) {
        int sign = 1;
        int sum = 0;
        int jishu = -1;
        while (n != 0) {
            sum += (sign * n % 10);
            sign *= -1;
            jishu *= -1;
            n /= 10;
        }
        return sum * jishu;
    }
}

public class LeetCode2544 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.alternateDigitSum(10));
    }
}
