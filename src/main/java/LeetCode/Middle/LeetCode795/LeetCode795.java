package LeetCode.Middle.LeetCode795;

class Solution {
    public int numSubarrayBoundedMax(int[] nums, int left, int right) {
        int one = -1;
        int two = -1;
        int res = 0;

        int size = nums.length;
        for (int i = 0; i < size; i++) {
            if (left <= nums[i] && nums[i] <= right) {
                one = i;
            }
            if (nums[i] > right) {
                two = i;
                one = -1;
            }
            if (one != -1) {
                res += one - two;
            }

        }

        return res;
    }

}

public class LeetCode795 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.numSubarrayBoundedMax(new int[]{2, 1, 4, 3}, 2, 3));
    }
}
