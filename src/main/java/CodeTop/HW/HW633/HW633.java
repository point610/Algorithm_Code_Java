package CodeTop.HW.HW633;

/**
 * @ClassName HW633
 * @Description TODO
 * @Author point
 * @Date 2023/12/25 20:36
 * @Version 1.0
 */
class Solution {
    public boolean judgeSquareSum(int c) {
        long left = 0;
        long right = (int) Math.sqrt(c) + 1;
        while (left <= right) {
            long temp = left * left + right * right;
            if (temp == c) {
                return true;
            } else if (temp < c) {
                left++;
            } else {
                right--;
            }
        }
        return false;
    }
}

public class HW633 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.judgeSquareSum(2147483600));
    }
}
