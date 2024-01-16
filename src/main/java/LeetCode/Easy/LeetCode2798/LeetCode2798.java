package LeetCode.Easy.LeetCode2798;

/**
 * @ClassName LeetCode2798
 * @Description TODO
 * @Author point
 * @Date 2023/10/4 14:08
 * @Version 1.0
 */
class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int size = hours.length;
        int sum = 0;
        for (int i = 0; i < size; i++) {
            if (hours[i] >= target) {
                sum++;
            }
        }
        return sum;
    }
}

public class LeetCode2798 {
}
