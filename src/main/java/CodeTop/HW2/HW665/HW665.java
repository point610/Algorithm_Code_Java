package CodeTop.HW2.HW665;

class Solution {
    public boolean checkPossibility(int[] nums) {
        int size = nums.length;

        for (int i = 0; i < size - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                int left = nums[i];
                int right = nums[i + 1];

                nums[i] = right;
                if (sort(nums)) {
                    return true;
                }

                nums[i] = left;
                nums[i + 1] = left;
                return sort(nums);
            }
        }

        return true;
    }

    private boolean sort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                return false;
            }
        }
        return true;
    }
}

public class HW665 {
}
