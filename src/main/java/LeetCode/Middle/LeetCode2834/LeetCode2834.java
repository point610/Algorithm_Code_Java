package LeetCode.Middle.LeetCode2834;

class Solution {
    public int minimumPossibleSum(int n, int target) {
        long temp = Math.min(target / 2, n);
        long sum = ((1 + temp) * temp / 2) % 1000000007;
        long left = n - temp;
        long one = target;
        long two = one + left - 1;
        sum = (sum + ((one + two) * left / 2 % 1000000007)) % 1000000007;

        return (int) sum;
    }
}

public class LeetCode2834 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.minimumPossibleSum(45456, 10867));
        System.out.println(solution.minimumPossibleSum(2, 3));
        System.out.println(solution.minimumPossibleSum(3, 3));
        System.out.println(solution.minimumPossibleSum(1, 1));
    }
}
