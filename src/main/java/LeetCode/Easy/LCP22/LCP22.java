package LeetCode.Easy.LCP22;

/**
 * @ClassName LCP22
 * @Description TODO
 * @Author point
 * @Date 2023/9/21 23:01
 * @Version 1.0
 */
class Solution {

    public int paintingPlan(int n, int k) {
        if (k == 0 || k == n * n) {
            return 1;
        }
        if (k < n) {
            return 0;
        }
        int res = 0;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                if ((i * n + j * n - i * j) == k) {
                    res += C(i, n) * C(j, n);
                }
            }
        }
        return res;
    }

    public int C(int i, int n) {
        int itemp = 1;
        for (int j = 1; j <= i; j++) {
            itemp *= j;
        }
        int step =  i;
        int ntemp = 1;
        for (int j = n; step != 0; j--, step--) {
            ntemp *= j;
        }
        return ntemp / itemp;
    }
}

public class LCP22 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.paintingPlan(2, 2));
        System.out.println(solution.C(2,6));
    }
}
