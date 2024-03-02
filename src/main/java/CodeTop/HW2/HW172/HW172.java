package CodeTop.HW2.HW172;

class Solution {
    public int trailingZeroes(int n) {

        int res = 0;
        while (n >= 5) {

            res += n / 5;
            n /= 5;

        }
        return res;
    }
}

public class HW172 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.trailingZeroes(3));
        System.out.println(solution.trailingZeroes(5));
        System.out.println(solution.trailingZeroes(0));
        System.out.println(solution.trailingZeroes(10));
    }
}
