package LeetCode.Easy.LeetCode326;

/**
 * @ClassName LeetCode326.LeetCode326
 * @Description TODO
 * @Author point
 * @Date 2023/7/13 21:06
 * @Version 1.0
 */
class Solution {
    public boolean isPowerOfThree(int n) {
        if (n < 0) {
            return false;
        }
        long sum = 1;
        while (true) {
            if (sum == n) {
                return true;
            } else if (sum > n) {
                return false;
            }
            sum *= 3;
        }
    }
}

public class LeetCode326 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isPowerOfThree(9));
    }
}

