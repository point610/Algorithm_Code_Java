package LeetCode.Easy.LeetCode2485;

/**
 * @ClassName LeetCode2485
 * @Description TODO
 * @Author point
 * @Date 2023/10/2 12:21
 * @Version 1.0
 */
class Solution {
    public int pivotInteger(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        int left = 0;
        int right = sum;
        int res = -1;
        for (int i = 1; i <= n; i++) {
            left += i-1;
            right -= i;
            if (left == right) {
                return i;
            }
        }
        return res;
    }
}

public class LeetCode2485 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.pivotInteger(8));
    }
}
