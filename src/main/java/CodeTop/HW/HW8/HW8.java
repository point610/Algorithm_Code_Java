package CodeTop.HW.HW8;

class Solution {

    public int myAtoi(String s) {
        long res = 0;

        boolean fushu = false;
        boolean zheng = false;


        boolean canend = false;
        for (char cc : s.toCharArray()) {
            if (res > Integer.MAX_VALUE) {
                break;
            }

            if (Character.isDigit(cc)) {
                res = res * 10 + (cc - '0');
                canend = true;
            }

            if (canend && !Character.isDigit(cc)) {
                break;
            }

            if (!canend && !Character.isDigit(cc) && cc != ' ' && cc != '+' && cc != '-') {
                break;
            }
            if (cc == '-') {
                canend = true;
                fushu = true;
            }
            if (cc == '+') {
                canend = true;
                zheng = true;
            }
            if (zheng && fushu) {
                return 0;
            }
        }
        if (!canend) {
            return 0;
        }
        if (fushu) {
            res = -res;
        }
        if (res >= Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        if (res <= Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        return (int) res;
    }
}

public class HW8 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.myAtoi("-91283472332"));
        System.out.println(solution.myAtoi("42"));
        System.out.println(solution.myAtoi("   -42"));
        System.out.println(solution.myAtoi("4193 with words"));
        System.out.println(solution.myAtoi("words and 987"));
        System.out.println(solution.myAtoi("00000-42a1234"));
        System.out.println(solution.myAtoi("-13+8"));
        System.out.println(solution.myAtoi("+-12"));
        System.out.println(solution.myAtoi("123-"));
        System.out.println(solution.myAtoi("  +  413"));
    }
}
