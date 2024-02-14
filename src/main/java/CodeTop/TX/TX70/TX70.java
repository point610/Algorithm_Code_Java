package CodeTop.TX.TX70;

class Solution {
    public int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }
        int one = 1;
        int two = 2;
        int sum = one + two;
        for (int i = 3; i <= n; i++) {
            sum = one + two;
            one = two;
            two = sum;
        }
        return sum;
    }
}

public class TX70 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.climbStairs(3));
    }
}
