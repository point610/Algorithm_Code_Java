package JavaGuide.tx.tx55;

class Solution {
    public boolean canJump(int[] nums) {
        int size = nums.length;
        int end = 0;
        for (int i = 0; i < size; i++) {
            if (i > end) {
                return false;
            }
            // 需要为i + nums[i]，为下标，nums为可以移动的步长，不是下标
            end = Math.max(end, i + nums[i]);
        }
        return true;
    }
}

public class tx55 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.canJump(new int[]{2, 3, 1, 1, 4}));
        System.out.println(solution.canJump(new int[]{3, 2, 1, 0, 4}));
    }
}
