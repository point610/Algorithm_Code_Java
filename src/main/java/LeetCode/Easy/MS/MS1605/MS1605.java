package LeetCode.Easy.MS.MS1605;

/**
 * @ClassName MS1605
 * @Description TODO
 * @Author point
 * @Date 2023/10/12 15:24
 * @Version 1.0
 */
class Solution {

    public int trailingZeroes(int n) {
        int res = 0;
        while (n >= 5) {
            n /= 5;
            res += n;
        }
        return res;
    }
}

public class MS1605 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.trailingZeroes(30);
    }
}
