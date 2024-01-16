package LeetCode.Easy.LeetCode1137;

/**
 * @ClassName LeetCode1137
 * @Description TODO
 * @Author point
 * @Date 2023/8/18 20:15
 * @Version 1.0
 */
class Solution {
    public int tribonacci(int n) {
        int[] temp = new int[4];
        temp[0] = 0;
        temp[1] = 1;
        temp[2] = 1;
        if (n <= 2) {
            return temp[n];
        }
        int index = 3;
        for (int i = 3; i <= n; i++) {
            temp[i % 4] = temp[(i - 1 + 4) % 4] + temp[(i - 2 + 4) % 4] + temp[(i - 3 + 4) % 4];
        }
        return temp[n % 4];
    }
}

public class LeetCode1137 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.tribonacci(25));
    }
}
