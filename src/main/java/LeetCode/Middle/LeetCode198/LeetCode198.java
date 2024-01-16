package LeetCode.Middle.LeetCode198;

/**
 * @ClassName LeetCode198
 * @Description TODO
 * @Author point
 * @Date 2023/9/2 23:48
 * @Version 1.0
 */
class Solution {
    public int rob(int[] nums) {

        int size = nums.length;

        int[] money = new int[size + 1];
        money[0] = 0;
        money[1] = nums[0];
        for (int i = 2; i <= size; i++) {
            // money[i - 1]为当前的位置不加
            // money[i - 2] + nums[i - 1]为当前的位置加上，需要加上上个位置的money
            money[i] = Math.max(money[i - 1], money[i - 2] + nums[i - 1]);
        }
        return money[size];

    }
}

public class LeetCode198 {
}
