package CodeTop.HW.HW34;

import java.util.Arrays;

/**
 * @ClassName HW34
 * @Description TODO
 * @Author point
 * @Date 2023/12/29 21:35
 * @Version 1.0
 */
class Solution {
    public int[] searchRange(int[] nums, int target) {

        int size = nums.length;
        int left = 0;
        int right = size - 1;
        while (left <= right) {

            int mid = (left + right) / 2;
            if (target == nums[mid]) {
                int ll = mid;
                int rr = mid;
                while (ll >= 0 && nums[mid] == nums[ll]) {
                    ll--;
                }
                while (rr < size && nums[mid] == nums[rr]) {
                    rr++;
                }
                return new int[]{ll + 1, rr - 1};

            }
            if (target < nums[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }

        }

        return new int[]{-1, -1};

    }
}

public class HW34 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8)));
        System.out.println(Arrays.toString(solution.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 6)));
        System.out.println(Arrays.toString(solution.searchRange(new int[]{}, 0)));
    }
}
