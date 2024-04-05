package LeetCode.Middle.LeetCode357;

class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 10;
        }
        int last = 10;
        int ans = 10;
        for (int i = 2; i <= n; i++) {
            int sum = getsum(i);
            ans = ans + sum;
        }
        return ans;
    }

    private int getsum(int n) {
        int sum = 9;
        for (int i = 1, index = 9; i < n; index--, i++) {
            sum *= index;
        }
        return sum;
    }
}

public class LeetCode357 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.countNumbersWithUniqueDigits(2));
        System.out.println(solution.countNumbersWithUniqueDigits(3));
    }
}
