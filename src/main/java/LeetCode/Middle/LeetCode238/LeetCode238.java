package LeetCode.Middle.LeetCode238;

/**
 * @ClassName LeetCode238
 * @Description TODO
 * @Author point
 * @Date 2023/11/17 23:43
 * @Version 1.0
 */
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int size = nums.length;
        int zerosize = 0;
        long sum = 1;
        for (int i = 0; i < size; i++) {
            if (nums[i] == 0) {
                zerosize++;
            } else {
                sum *= nums[i];
            }
        }
        int[] res = new int[size];
        if (zerosize > 1) {
            return res;
        } else if (zerosize == 1) {
            for (int i = 0; i < size; i++) {
                if (nums[i] == 0) {
                    res[i] = (int) sum;
                    return res;
                }
            }
        } else {
            for (int i = 0; i < size; i++) {
                res[i] = (int) (sum / nums[i]);
            }
        }
        return res;
    }
}

public class LeetCode238 {
}
