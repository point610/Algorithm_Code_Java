package LeetCode.Middle.LeetCode565;

class Solution {
    public int arrayNesting(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == -1) {
                continue;
            }
            int index = i;
            int times = 0;
            while (nums[index] != -1) {
                times++;
                int temp = index;
                index = nums[index];
                nums[temp] = -1;
            }
            max = Math.max(max, times);
        }

        return max;
    }
}

public class LeetCode565 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.arrayNesting(new int[]{5, 4, 0, 3, 1, 6, 2}));
    }
}
