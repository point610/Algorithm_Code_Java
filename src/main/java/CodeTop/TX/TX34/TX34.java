package CodeTop.TX.TX34;

import java.util.Arrays;

class Solution {
    public int[] searchRange(int[] nums, int target) {

        if (nums == null || nums.length == 0) {
            return new int[]{-1, -1};
        }

        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                left = mid;
                break;
            }
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        if (nums[left] != target) {
            return new int[]{-1, -1};
        }


        int one = left;
        int two = left;
        while (one >= 0 && nums[one] == target) {
            one--;
        }
        while (two < nums.length && nums[two] == target) {
            two++;
        }
        return new int[]{one + 1, two - 1};

    }
}

public class TX34 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 6)));
        System.out.println(Arrays.toString(solution.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8)));
        System.out.println(Arrays.toString(solution.searchRange(new int[]{}, 0)));
    }
}
