package LeetCode.Easy.LeetCode2894;

/**
 * @ClassName LeetCode2894
 * @Description TODO
 * @Author point
 * @Date 2023/10/9 11:26
 * @Version 1.0
 */
class Solution {
    public int differenceOfSums(int n, int m) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % m == 0) {
                sum -= i;
            } else {
                sum += i;
            }
        }return sum;
    }
}

public class LeetCode2894 {
}
