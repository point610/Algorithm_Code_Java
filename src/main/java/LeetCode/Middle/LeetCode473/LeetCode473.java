package LeetCode.Middle.LeetCode473;

import java.util.Arrays;

class Solution {
    private boolean find;
    private int[] matchsticks;

    public boolean makesquare(int[] matchsticks) {
        this.matchsticks = matchsticks;
        int sum = 0;
        find = false;
        int size = matchsticks.length;
        for (int ii : matchsticks) {
            sum += ii;
        }
        if (sum % 4 != 0) {
            return false;
        }
        int target = sum / 4;
        boolean[] visit = new boolean[size];
        Arrays.sort(matchsticks);
        dfs(visit, 0, target, 0, 1);
        return find;
    }

    private void dfs(boolean[] visit, int tempsum, int target, int index, int times) {
        if (find) {
            return;
        }
        if (tempsum == target) {
            if (times == 4) {
                find = true;
                return;
            }
            dfs(visit, 0, target, 0, times + 1);
            return;
        }

        if (tempsum > target || index == visit.length) {
            return;
        }

        dfs(visit, tempsum, target, index + 1, times);

        if (visit[index]) {
            return;
        }
        visit[index] = true;
        dfs(visit, tempsum + matchsticks[index], target, index + 1, times);
        visit[index] = false;
    }
}

public class LeetCode473 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.makesquare(new int[]{3, 3, 3, 3, 4}));
        System.out.println(solution.makesquare(new int[]{1, 1, 2, 2, 2}));
    }
}
