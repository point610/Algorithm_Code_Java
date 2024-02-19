package LeetCode.Easy.LeetCode3038;

class Solution {
    public int maxOperations(int[] nums) {
        int sum = nums[0] + nums[1];
        int times = 1;
        for (int i = 3; i < nums.length; i += 2) {
            if (sum == (nums[i] + nums[i - 1])) {
                times++;
            }else {
                break;
            }
        }

        return times;
    }
}

public class LeetCode3038 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.maxOperations(new int[]{2, 2, 3, 2, 4, 2, 3, 3, 1, 3}));
    }
}
