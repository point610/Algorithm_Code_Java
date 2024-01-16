package LeetCode.Easy.LeetCode2644;

/**
 * @ClassName LeetCode2644
 * @Description TODO
 * @Author point
 * @Date 2023/10/3 12:35
 * @Version 1.0
 */
class Solution {
    int getnumber(int[] nums, int div) {
        int size = nums.length;
        int res = 0;
        for (int i = 0; i < size; i++) {
            if (nums[i] % div == 0) {
                res++;
            }
        }
        return res;
    }

    public int maxDivScore(int[] nums, int[] divisors) {
        int size = divisors.length;
        int max = 0;
        int minnumber = Integer.MAX_VALUE;
        for (int i = 0; i < size; i++) {
            int temp = getnumber(nums, divisors[i]);
            if (temp > max) {
                max = temp;
                minnumber = divisors[i];
            }
            if (temp == max) {
                minnumber = Math.min(minnumber, divisors[i]);
            }
        }
        return minnumber;
    }
}

public class LeetCode2644 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.maxDivScore(new int[]{20, 14, 21, 10}, new int[]{5, 7, 5}));
    }
}
