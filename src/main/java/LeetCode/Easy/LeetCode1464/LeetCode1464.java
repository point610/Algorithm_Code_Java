package LeetCode.Easy.LeetCode1464;

/**
 * @ClassName LeetCode1464
 * @Description TODO
 * @Author point
 * @Date 2023/8/11 13:44
 * @Version 1.0
 */
class Solution {
    public int maxProduct(int[] nums) {
        int oneIndex = 0;
        int oneMax = 0;
        int twoIndex = 0;
        int twoMax = 0;
        int size = nums.length;
        for (int i = 0; i < size; i++) {
            if (oneMax < nums[i]) {
                oneIndex = i;
                oneMax = nums[i];
            }
        }
        for (int i = 0; i < size; i++) {
            if (i != oneIndex && twoMax < nums[i]) {
                twoIndex = i;
                twoMax = nums[i];
            }
        }
        return (oneMax - 1) * (twoMax - 1);

    }
}

public class LeetCode1464 {
}
