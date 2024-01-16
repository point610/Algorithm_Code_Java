package LeetCode.Easy.LeetCode367;

/**
 * @ClassName LeetCode367
 * @Description TODO
 * @Author point
 * @Date 2023/7/14 21:30
 * @Version 1.0
 */
class Solution {
    public boolean isPerfectSquare(int num) {
        int temp = (int) Math.sqrt(num);
        if (temp * temp == num) {
            return true;
        }
        return false;
    }
}

public class LeetCode367 {
}
