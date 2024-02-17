package CodeTop.TX.TX724;

class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        for (int ii : nums) {
            sum += ii;
        }
        int left = 0;
        int size = nums.length;
        for (int i = 0; i < size; i++) {
            if (left == sum - left - nums[i]) {
                return i;
            }
            left += nums[i];
        }
        return -1;
    }
}

public class TX724 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.pivotIndex(new int[]{1, 7, 3, 6, 5, 6}));
        System.out.println(solution.pivotIndex(new int[]{1, 2, 3}));
        System.out.println(solution.pivotIndex(new int[]{2, 1, -1}));
    }
}
