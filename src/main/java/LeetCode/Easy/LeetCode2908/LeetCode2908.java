package LeetCode.Easy.LeetCode2908;

/**
 * @ClassName LeetCode2908
 * @Description TODO
 * @Author point
 * @Date 2024/1/17 0:18
 * @Version 1.0
 */
class Solution {
    public int minimumSum(int[] nums) {
        int mmm = 9999;
        int size = nums.length;
        int left = 1;
        int right = size - 2;
        for (int j = left; j <= right; j++) {

            int lmin = Integer.MAX_VALUE;
            int rmin = Integer.MAX_VALUE;

            for (int i = 0; i < j; i++) {
                lmin = Math.min(lmin, nums[i]);
            }
            for (int i = j + 1; i < size; i++) {
                rmin = Math.min(rmin, nums[i]);
            }

            if (lmin >= nums[j] || rmin >= nums[j]) {
                continue;
            }
            mmm = Math.min(mmm, lmin + rmin + nums[j]);
        }
        if (mmm == 9999) {
            return -1;
        }
        return mmm;
    }
}

public class LeetCode2908 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.minimumSum(new int[]{8, 6, 1, 5, 3}));
        System.out.println(solution.minimumSum(new int[]{5, 4, 8, 7, 10, 2}));
        System.out.println(solution.minimumSum(new int[]{6, 5, 4, 3, 4, 5}));
    }
}
