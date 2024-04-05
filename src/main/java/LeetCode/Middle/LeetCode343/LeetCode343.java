package LeetCode.Middle.LeetCode343;

class Solution {
    public int integerBreak(int n) {
        if (n <= 3) {
            return n - 1;
        }
        int one = n / 3;
        int two = n % 3;
        if (two == 0) {
            return (int) Math.pow(3, one);
        }
        if (two == 1){
            return (int) Math.pow(3, one - 1) * 4;
        }
        return (int) Math.pow(3, one) * 2;
    }
}


public class LeetCode343 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.integerBreak(10));
        System.out.println(solution.integerBreak(2));
    }
}
