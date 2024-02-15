package CodeTop.TX.TX69;

class Solution {
    public int mySqrt(int x) {
        int left = 0;
        int right = x;
        int aaa = 0;

        while (left <= right) {
            int mid = (left + right) / 2;
            // 注意mid的范围，为int 的，相乘可能超出int 的范围
            long temp = (long) mid * mid;
            if (temp == x) {
                return mid;
            }
            if (temp < x) {
                aaa = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return aaa;
    }
}

public class TX69 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.mySqrt(4));
        System.out.println(solution.mySqrt(8));
        System.out.println(solution.mySqrt(2147395599));
    }
}
