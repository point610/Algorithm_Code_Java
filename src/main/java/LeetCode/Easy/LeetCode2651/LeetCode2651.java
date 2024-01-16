package LeetCode.Easy.LeetCode2651;

/**
 * @ClassName LeetCode2651
 * @Description TODO
 * @Author point
 * @Date 2023/10/3 12:41
 * @Version 1.0
 */
class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        return (arrivalTime + delayedTime) % 24;

    }
}

public class LeetCode2651 {
}
