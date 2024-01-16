package LeetCode.Easy.LeetCode2455;

/**
 * @ClassName LeetCode2455
 * @Description TODO
 * @Author point
 * @Date 2023/10/2 11:14
 * @Version 1.0
 */
class Solution {
    public int averageValue(int[] nums) {
        int size = nums.length;
        int sum = 0;
        int number = 0;
        for (int i = 0; i < size; i++) {
            if (nums[i] % 2 == 0 && nums[i] % 3 == 0) {
                number++;
                sum += nums[i];
            }
        }
        return number==0?0:sum / number;
    }
}

public class LeetCode2455 {
}
