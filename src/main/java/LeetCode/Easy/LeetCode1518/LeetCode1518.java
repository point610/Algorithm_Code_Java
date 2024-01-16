package LeetCode.Easy.LeetCode1518;

/**
 * @ClassName LeetCode1518
 * @Description TODO
 * @Author point
 * @Date 2023/9/27 23:08
 * @Version 1.0
 */
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int current = numBottles;
        while (true) {

            if (current < numExchange) {
                break;
            }
            int more = current / numExchange;
            int left = current % numExchange;
            numBottles += more;
            current = more + left;
        }
        return numBottles;
    }
}

public class LeetCode1518 {
}
