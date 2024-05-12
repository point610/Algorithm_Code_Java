package LeetCode.Middle.LeetCode698;

import java.util.Arrays;
import java.util.Set;

class Solution {
    private int target;
    private boolean[] visit;
    private boolean find;

    private void dfs(int[] nums, int index, int k, int sum, int start) {
        if (find || k < 1 || index >= nums.length) {
            return;
        }
        if (sum == target) {
            if (k == 1) {
                find = true;
            } else {
                dfs(nums, 0, k - 1, 0, 0);
            }
            return;
        }
        for (int i = start; i < nums.length; i++) {
            if (!find && !visit[i] && sum + nums[i] <= target) {
                visit[i] = true;
                dfs(nums, index + 1, k, sum + nums[i], i + 1);
                visit[i] = false;
            }
        }
    }

    public boolean canPartitionKSubsets(int[] nums, int k) {
        if (k == 1) {
            return true;
        }
        int sum = Arrays.stream(nums).sum();
        if (sum % k != 0) {
            return false;
        }
        find = false;
        this.target = sum / k;
        Arrays.sort(nums);
        visit = new boolean[nums.length];

        dfs(nums, 0, k, 0, 0);

        return find;
    }
}

public class LeetCode698 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.canPartitionKSubsets(new int[]{4, 3, 2, 3, 5, 2, 1}, 4));
        System.out.println(solution.canPartitionKSubsets(new int[]{1, 2, 3, 4}, 3));
    }
}
