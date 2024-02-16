package CodeTop.TX.TX581;

class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int size = nums.length;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int right = -1;
        int left = -1;

        // 找right和left
        for (int i = 0, j = size - 1; i < size; j--, i++) {
            // 找right
            if (max > nums[i]) {
                right = i;
            } else {
                max = nums[i];
            }

            // 找left
            if (min < nums[j]) {
                left = j;
            } else {
                min = nums[j];
            }
        }

        if (right == -1) {
            return 0;
        } else {
            return right - left + 1;
        }

    }
}

public class TX581 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.findUnsortedSubarray(new int[]{2, 6, 4, 8, 10, 9, 15}));
        System.out.println(solution.findUnsortedSubarray(new int[]{1, 2, 3, 4}));
        System.out.println(solution.findUnsortedSubarray(new int[]{1}));
    }
}
