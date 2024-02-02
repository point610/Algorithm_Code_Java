package LeetCode.Easy.LeetCode3010;

class Solution {
    public int minimumCost(int[] nums) {

        int onemaxindex = 1;
        int twomaxindex = 1;
        int size = nums.length;
        for (int i = 1; i < size; i++) {
            if (nums[i] <= nums[onemaxindex]) {
                onemaxindex = i;
            }
        }

        if (onemaxindex == 1) {
            twomaxindex = 2;
        }

        for (int i = 1; i < size; i++) {
            if (nums[i] <= nums[twomaxindex] && i != onemaxindex) {
                twomaxindex = i;
            }
        }

        return nums[0] + nums[onemaxindex] + nums[twomaxindex];
    }
}

public class LeetCode3010 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.minimumCost(new int[]{1, 2, 3, 12}));
        System.out.println(solution.minimumCost(new int[]{5, 4, 3}));
        System.out.println(solution.minimumCost(new int[]{10, 3, 1, 1}));
    }
}
