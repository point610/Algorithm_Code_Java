package CodeTop.HW.HW400;

/**
 * @ClassName HW400
 * @Description TODO
 * @Author point
 * @Date 2023/12/26 10:18
 * @Version 1.0
 */
class Solution {
    public int findNthDigit(int n) {
        if (n < 10) {
            return n;
        }
        long startnumber = 0;
        long endnumber = 10;

        while (true) {
            int temp = (int) (Math.pow(10, getzeronumber(endnumber) - 1) * 9 * (String.valueOf(endnumber).length() - 1));
            if (n - temp <= 0) {
                break;
            }
            n -= temp;
            endnumber *= 10;
        }
        startnumber = endnumber / 10;
        int size = String.valueOf(startnumber).length();
        for (int i = (int) startnumber; i < endnumber; i++) {
            if (0 < n - size) {
                n -= size;
            } else {
                return String.valueOf(i).charAt(n - 1) - '0';
            }
        }
        return 0;
    }

    private int getzeronumber(long one) {
        return String.valueOf(one).length() - 1;
    }
}


public class HW400 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.findNthDigit(11));
        System.out.println(solution.findNthDigit(1000));
        System.out.println(solution.findNthDigit(2147483647));
    }
}
