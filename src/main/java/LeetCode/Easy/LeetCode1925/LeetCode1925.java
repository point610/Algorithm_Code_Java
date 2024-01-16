package LeetCode.Easy.LeetCode1925;

/**
 * @ClassName LeetCode1925
 * @Description TODO
 * @Author point
 * @Date 2023/9/29 12:17
 * @Version 1.0
 */
class Solution {
    int is(int a, int b, int c) {
        return a * a + b * b - c * c;
    }

    public int countTriples(int n) {
        int sum = 0;
        for (int i = 1; i <= n - 2; i++) {
            for (int j = i + 1; j <= n - 1; j++) {
                for (int k = j + 1; k <= n; k++) {
                    int temp = is(i, j, k);
                    if (temp < 0) {
                        break;
                    }
                    if (temp == 0) {
                        sum++;
                    }
                }
            }
        }
        return sum * 2;
    }
}

public class LeetCode1925 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.countTriples(18));
    }
}
