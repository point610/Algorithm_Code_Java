package LeetCode.Easy.LeetCode1523;

/**
 * @ClassName LeetCode1523
 * @Description TODO
 * @Author point
 * @Date 2023/9/27 23:05
 * @Version 1.0
 */
class Solution {
    public int countOdds(int low, int high) {
        if (low % 2 == 1) {
            low--;
        }
        if (high % 2 == 1) {
            high++;
        }
        return (high - low) / 2;

    }
}

public class LeetCode1523 {
}
