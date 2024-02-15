package CodeTop.TX.TX7;

class Solution {
    public int reverse(int x) {

        boolean fushu = false;
        if (x < 0) {
            fushu = true;
            x = -x;
        }

        long aaa = 0;
        while (x != 0) {
            int temp = x % 10;
            x /= 10;
            aaa = aaa * 10 + temp;
        }

        if (aaa > Integer.MAX_VALUE || aaa < Integer.MIN_VALUE) {
            return 0;
        }
        if (fushu) {
            return (int) -aaa;
        }
        return (int) aaa;
    }
}

public class TX7 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.reverse(1534236469));
        System.out.println(solution.reverse(123));
        System.out.println(solution.reverse(-123));
        System.out.println(solution.reverse(120));
        System.out.println(solution.reverse(0));
    }
}
