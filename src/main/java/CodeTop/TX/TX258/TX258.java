package CodeTop.TX.TX258;

class Solution {
    public int addDigits(int num) {
        while (num >= 10) {
            num = get(num);
        }
        return num;
    }

    private int get(int one) {
        int res = 0;
        while (one != 0) {
            res += one % 10;
            one /= 10;
        }

        return res;
    }
}

public class TX258 {
}
