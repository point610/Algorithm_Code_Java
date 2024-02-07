package CodeTop.HW.HW410;

class Solution {
    public int splitArray(int[] nums, int k) {
        int size = nums.length;
        int left = 0;
        int right = 0;
        for (int i = 0; i < size; i++) {
            left = Math.max(left, nums[i]);
            right += nums[i];
        }

        // 对分组中的数值的总和进行二分
        while (left <= right) {
            int mid = (left + right) / 2;
            if (check(nums, mid, k)) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    private boolean check(int[] nums, int targetsum, int k) {
        int count = 1;
        int tempsum = 0;
        for (int iii : nums) {
            if (tempsum + iii > targetsum) {
                count++;
                tempsum = 0;
            }
            tempsum += iii;
        }

        return count <= k;
    }
}

public class HW410 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.splitArray(new int[]{7, 2, 5, 10, 8}, 2));
        System.out.println(solution.splitArray(new int[]{1, 2, 3, 4, 5}, 2));
        System.out.println(solution.splitArray(new int[]{1, 4, 4}, 3));
    }
}
