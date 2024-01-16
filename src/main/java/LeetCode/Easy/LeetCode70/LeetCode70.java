package LeetCode.Easy.LeetCode70;

/**
 * @ClassName LeetCode70
 * @Description TODO
 * @Author point
 * @Date 2023/8/9 22:18
 * @Version 1.0
 */
class Solution {

    public int climbStairs(int n) {
        int[] temp = new int[46];
        temp[0] = 0;
        temp[1] = 1;
        temp[2] = 2;
        for (int i = 3; i <= n; i++) {
            temp[i] = temp[i - 1] + temp[i - 2];
        }
        return temp[n];
    }
}

public class LeetCode70 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.climbStairs(2));
    }
}
