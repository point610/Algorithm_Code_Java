package JavaGuide.dtgh.dtgh509;

class Solution {
    public int fib(int n) {
        if (n <= 1) {
            return n;
        }
        int one = 1;
        int two = 1;

        for (int i = 2; i < n; i++) {
            int temp = one + two;
            one = two;
            two = temp;
        }

        return two;
    }
}

public class dtgh509 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.fib(2));
        System.out.println(solution.fib(3));
        System.out.println(solution.fib(4));
    }
}
