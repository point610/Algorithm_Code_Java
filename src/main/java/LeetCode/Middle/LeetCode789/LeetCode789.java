package LeetCode.Middle.LeetCode789;

class Solution {
    public boolean escapeGhosts(int[][] ghosts, int[] target) {
        int one = get(new int[]{0, 0}, target);
        for (int[] temp : ghosts) {
            if (one >= get(temp, target)) {
                return false;
            }
        }

        return true;
    }

    private int get(int[] one, int[] target) {
        return Math.abs(one[0] - target[0]) + Math.abs(one[1] - target[1]);
    }
}

public class LeetCode789 {
}
