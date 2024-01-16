package CodeTop.HW.HW494;

/**
 * @ClassName HW494
 * @Description TODO
 * @Author point
 * @Date 2023/12/30 22:41
 * @Version 1.0
 */
class Solution {
    int count;

    void DFS(int[] nums, int target, int sum, int index) {
        if (index >= nums.length && sum == target) {
            count++;
            return;
        }
        if (index>=nums.length){
            return;
        }
        DFS(nums, target, sum + nums[index], index + 1);
        DFS(nums, target, sum - nums[index], index + 1);
    }

    public int findTargetSumWays(int[] nums, int target) {
        count = 0;
        DFS(nums, target, 0, 0);
        return count;
    }
}

public class HW494 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.findTargetSumWays(new int[]{1, 1, 1, 1, 1}, 3));
        System.out.println(solution.findTargetSumWays(new int[]{1}, 1));
    }
}
