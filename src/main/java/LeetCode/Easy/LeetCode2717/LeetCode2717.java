package LeetCode.Easy.LeetCode2717;

/**
 * @ClassName LeetCode2717
 * @Description TODO
 * @Author point
 * @Date 2023/10/1 17:57
 * @Version 1.0
 */
class Solution {
    public int semiOrderedPermutation(int[] nums) {

        int left = 0;
        int right = nums.length - 1;

        while (nums[left] != 1) {
            left++;
        }
        while (nums[right] != nums.length) {
            right--;
        }

        if (right < left) {
            return left + nums.length - 1 - right- 1;
        }
        return left + nums.length - 1 - right;

    }
}

public class LeetCode2717 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.semiOrderedPermutation(new int[]{2,4,1,3}));
    }
}
