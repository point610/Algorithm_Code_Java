package LeetCode.Easy.LeetCode1217;

/**
 * @ClassName LeetCode1217
 * @Description TODO
 * @Author point
 * @Date 2023/8/18 23:42
 * @Version 1.0
 */
class Solution {
    public int minCostToMoveChips(int[] position) {
        int ou = 0;
        int ji = 0;
        int size = position.length;
        for (int i = 0; i < size; i++) {
            if (position[i] % 2 == 0) {
                ou++;
            } else {
                ji++;
            }
        }
        return Math.min(ou, ji);
    }
}

public class LeetCode1217 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.minCostToMoveChips(new int[]{1, 2, 3});
    }
}
