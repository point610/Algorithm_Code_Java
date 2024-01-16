package LeetCode.Easy.LeetCode2960;

/**
 * @ClassName LeetCode2960
 * @Description TODO
 * @Author point
 * @Date 2024/1/16 23:39
 * @Version 1.0
 */
class Solution {
    public int countTestedDevices(int[] batteryPercentages) {
        int ttt = 0;
        for (int ii : batteryPercentages) {
            if (ii - ttt > 0) {
                ttt++;
            }

        }
        return ttt;
    }
}

public class LeetCode2960 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.countTestedDevices(new int[]{1, 1, 2, 1, 3}));
        System.out.println(solution.countTestedDevices(new int[]{0, 1, 2}));
    }
}
