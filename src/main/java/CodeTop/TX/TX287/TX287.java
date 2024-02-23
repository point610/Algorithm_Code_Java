package CodeTop.TX.TX287;

class Solution {
    public int findDuplicate(int[] nums) {
        int size = nums.length;
        for (int i = 0; i < size; i++) {
            nums[i]--;
        }

        for (int i = 0; i < size; i++) {
            if (nums[i] == i) {
                continue;
            } else {
                // 交换
                if (nums[i] == nums[nums[i]]) {
                    return nums[i] + 1;
                }
                swap(nums, i, nums[i]);
                i--;
            }
        }

        return 0;
    }

    private void swap(int[] nums, int one, int two) {
        int temp = nums[one];
        nums[one] = nums[two];
        nums[two] = temp;
    }
}

public class TX287 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.findDuplicate(new int[]{1, 3, 4, 2, 2}));
        System.out.println(solution.findDuplicate(new int[]{3, 1, 3, 4, 2}));
    }
}
