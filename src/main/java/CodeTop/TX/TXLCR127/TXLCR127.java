package CodeTop.TX.TXLCR127;

class Solution {
    public int trainWays(int num) {
        if (num == 0) {
            return 1;
        }
        if (num <= 2) {
            return num;
        }

        int one = 1;
        int two = 2;
        for (int i = 3; i <= num; i++) {
            int temp = (one + two) % 1000000007;
            one = two;
            two = temp;
        }
        return two;
    }
}

public class TXLCR127 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.trainWays(5));
    }
}
