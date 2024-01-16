package LeetCode.Easy.LeetCode2427;

/**
 * @ClassName LeetCode2427
 * @Description TODO
 * @Author point
 * @Date 2023/10/1 17:15
 * @Version 1.0
 */
class Solution {
    public int commonFactors(int a, int b) {
        int max = Math.max(a, b);
        int min = Math.min(a, b);
        int sum = 0;
        for (int i = 1; i <= min; i++) {
            if (max % i == 0 && min % i == 0) {
                sum++;
            }
        }
        return sum;
    }
}

public class LeetCode2427 {
}
