package LeetCode.Middle.LeetCode287;

/**
 * @ClassName LeetCode287
 * @Description TODO
 * @Author point
 * @Date 2023/11/24 21:14
 * @Version 1.0
 */
class Solution {
    public int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[nums[0]];

        // slow和fast相遇的条件为index一样
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[nums[fast]];
        }

        int one = 0;
        int two = slow;

        // 退出的条件为index一样
        while (one != two) {
            one = nums[one];
            two = nums[two];
        }
        return one;
    }
}

public class LeetCode287 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.findDuplicate(new int[]{1, 3, 4, 2, 2}));
    }
}
