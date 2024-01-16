package LeetCode.Middle.LeetCode45;

/**
 * @ClassName LeetCode45
 * @Description TODO
 * @Author point
 * @Date 2023/10/23 23:44
 * @Version 1.0
 */
class Solution {
    int minnumber = Integer.MAX_VALUE;


    public int jump(int[] nums) {
        int size = nums.length;
        int[] times = new int[size];
        for (int i = 1; i < size; i++) {
            int minstep = size;
            for (int j = i - 1; j >= 0; j--) {
                if (j + nums[j] < i) {
                    continue;
                }
                minstep = Math.min(minstep, times[j]);
            }
            times[i] = minstep + 1;
        }

        return times[size - 1];
    }


}

public class LeetCode45 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.jump(new int[]{2, 3, 1, 1, 4});
    }
}
