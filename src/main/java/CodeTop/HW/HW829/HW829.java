package CodeTop.HW.HW829;

class Solution {
    public int consecutiveNumbersSum(int n) {
        int res = 0;
        n = n * 2;
        for (int temp = 1; temp * temp < n; temp++) {
            if (n % temp != 0) {
                continue;
            }
            //(2a+k−1)×k=2n
            // 计算a存在
            if ((n / temp - temp + 1) % 2 == 0) {
                res++;
            }
        }
        return res;
    }
}

public class HW829 {
}
