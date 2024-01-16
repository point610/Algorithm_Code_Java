package LeetCode.Easy.LeetCode2210;

/**
 * @ClassName LeetCode2210
 * @Description TODO
 * @Author point
 * @Date 2023/9/30 12:54
 * @Version 1.0
 */
class Solution {
    public int countHillValley(int[] nums) {

        int size = nums.length;
        int sum = 0;
        for (int i = 1; i < size - 1; i++) {
            if (nums[i] == nums[i - 1]) {
                continue;
            }

            int left = i;
            while (0 <= left && nums[left] == nums[i]) {
                left--;
            }
            int right = i;
            while (right < size && nums[i] == nums[right]) {
                right++;
            }

            if (left == -1 && right == size) {
                break;
            }
            if (left == -1 || right == size) {
                continue;
            }

            if (nums[left] > nums[i] && nums[right] > nums[i]
                    || nums[left] < nums[i] && nums[right] < nums[i]) {
                sum++;
            }
        }
        return sum;
    }
}

public class LeetCode2210 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.countHillValley(new int[]{6,6,5,5,4,1}));
    }
}
