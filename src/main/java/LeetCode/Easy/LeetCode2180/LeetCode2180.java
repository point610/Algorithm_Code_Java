package LeetCode.Easy.LeetCode2180;

/**
 * @ClassName LeetCode2180
 * @Description TODO
 * @Author point
 * @Date 2023/9/30 18:10
 * @Version 1.0
 */
class Solution {
    boolean isoushu(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum % 2 == 0;
    }

    public int countEven(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            if (isoushu(i)) {
                sum++;
            }
        }return sum;
    }
}

public class LeetCode2180 {
}
