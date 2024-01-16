package LeetCode.Easy.LeetCode2652;

/**
 * @ClassName LeetCode2652
 * @Description TODO
 * @Author point
 * @Date 2023/10/3 12:43
 * @Version 1.0
 */
class Solution {
    public int sumOfMultiples(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}

public class LeetCode2652 {
}
