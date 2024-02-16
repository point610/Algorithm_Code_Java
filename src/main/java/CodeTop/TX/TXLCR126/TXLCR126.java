package CodeTop.TX.TXLCR126;

class Solution {
    public int fib(int n) {
        if (n <= 1) {
            return n;
        }
        int one = 0;
        int two = 1;
        for (int i = 2; i <= n; i++) {
            int temp = (one + two) % 1000000007;
            one = two;
            two = temp;
        }
        return two;
    }
}

public class TXLCR126 {
}
