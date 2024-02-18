package CodeTop.TX.TX8;

class Solution {
    public int myAtoi(String s) {
        long res = 0;
        s = s.trim();
        int size = s.length();
        boolean fushu = false;
        boolean hassign = false;
        for (int i = 0; i < size; i++) {
            char cc = s.charAt(i);
            if (cc == '-' || cc == '+') {
                if (hassign) {
                    break;
                }
                if (cc == '-') {
                    fushu = true;
                }
                hassign = true;
                continue;
            }
            if (Character.isDigit(cc)) {
                hassign = true;
                // 数字累加
                long temp = res * 10 + (cc - '0');
                if (check(fushu, temp)) {
                    res = temp;
                } else {
                    if (fushu) {
                        return Integer.MIN_VALUE;
                    } else {
                        return Integer.MAX_VALUE;
                    }
                }
            } else {
                break;
            }
        }
        if (fushu) {
            return (int) -res;
        }
        return (int) res;
    }

    private boolean check(boolean fushu, long one) {
        if (fushu) {
            one = -one;
        }
        return Integer.MIN_VALUE <= one && one <= Integer.MAX_VALUE;
    }
}

public class TX8 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.myAtoi("42"));
        System.out.println(solution.myAtoi("   -42"));
        System.out.println(solution.myAtoi("4193 with words"));
        System.out.println(solution.myAtoi("-91283472332"));
    }
}
