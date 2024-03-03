package CodeTop.HW2.HW263;

class Solution {
    public boolean isUgly(int n) {
        if (n == 0) {
            return false;
        }
        while (true) {
            if (n == 1) {
                return true;
            }
            if (n % 2 == 0) {
                n /= 2;
            } else if (n % 3 == 0) {
                n /= 3;
            } else if (n % 5 == 0) {
                n /= 5;
            } else {
                return false;
            }
        }
    }
}
public class HW263 {
}