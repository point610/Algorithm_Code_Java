package CodeTop.TX.TX26;

class Solution {
    public int removeDuplicates(int[] nums) {
        int size = nums.length;
        if (size == 1) {
            return 1;
        }

        int oneindex = 0;
        int twoindex = 1;

        while (twoindex < size) {
            if (nums[oneindex] == nums[twoindex]) {
                twoindex++;
            } else {
                nums[oneindex + 1] = nums[twoindex];

                oneindex++;
                twoindex++;
            }
        }

        return oneindex + 1;
    }
}

public class TX26 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.removeDuplicates(new int[]{1, 1, 2}));
        System.out.println(solution.removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}));
    }
}
